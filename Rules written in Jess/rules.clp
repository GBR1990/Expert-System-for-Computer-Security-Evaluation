;; all the rules
;; author - Bulusu, Gireeshma, Rohit

;; CREATING TEMPLATES FOR ALL RULES



;2. if the password has mixed characters
;;(deftemplate mixed
  ;;  (slot mchar))

;3. How many repeated characters
;;(deftemplate repeated
  ;;  (slot rchar))

;4. If it includes letters, numbers and symbols
;;(deftemplate lns
   ;; (slot lnspass))

;5. If it is a keyboard walk
;;(deftemplate keywalk
  ;;  (slot kwalk))



;7. How often is password reset
;;(deftemplate reset
    ;;(slot preset))




;-------
;-------
;; RULES WITH TEMPLATES
;--------
;---------


;variable for final recommendation
(defglobal  ?*name* = "not def")


;;-----------------
;1. Password length
;------------------


(deftemplate passwordLength (slot value))
(defglobal ?*pwdValue* = "not def")

;1. password length =20
(defrule pwdlenmax
    ?r<- (passwordLength {value == 20} )
    =>
    (bind ?*pwdValue* 100)

   )

;2. password length is 15-20
(defrule pwdLength
    ?r<- (passwordLength {value < 20 && value > 15} )
    =>
    (bind ?*pwdValue* 80)
    )

;3 password length is 10-15
(defrule pwdLentenfifteen
    ?r<- (passwordLength {value < 15 && value > 10} )
    =>
    (bind ?*pwdValue* 60)
    )

;4 password length is 6-10
(defrule pwdLensixten
    ?r<- (passwordLength {value < 10 && value > 6} )
    =>
    (bind ?*pwdValue* 40)
    )



;-------------------
;2. Mixed Case
;-------------------

(deftemplate mixedChoice (slot value))
(defglobal ?*mixedChoice* = "not def")

;5 If mixed cases are there.
(defrule michoice
?r<- (mixedChoice (value ?v&: (eq ?v yes)))
    =>
   (bind ?*mixedChoice* 100)
    )

;6 If mixed cases are not there.
(defrule nomchoice
?r<- (mixedChoice (value ?v&: (eq ?v no)))
    =>
   (bind ?*mixedChoice* 50)
    )


;--------------------------------
;3. Number of repeated characters
;--------------------------------

(deftemplate repeatedcharacters (slot value))
(defglobal ?*repeatedchar* = "not def")


;7 If count is 0
(defrule repeatedzero
    ?r<- (repeatedcharacters {value == 0} )
    =>
    (bind ?*repeatedchar* 100)
   )

;8 If count is 1-3
(defrule repeatedonethree
    ?r<- (repeatedcharacters {value <= 3 && value >= 1} )
    =>
    (bind ?*repeatedchar* 80)
   )

;9 If count is 4-6
(defrule repeatedfoursix
    ?r<- (repeatedcharacters {value <= 6 && value >= 4} )
    =>
    (bind ?*repeatedchar* 60)
   )

;10 If count is >6
(defrule repeatedsix
    ?r<- (repeatedcharacters {value > 6} )
    =>
    (bind ?*repeatedchar* 40)
   )


;-----------------------------------------
;4. Includes letters, numbers and symbols
;-----------------------------------------
(deftemplate letnumsyb (slot value))
(defglobal ?*lns* = "not def")

;11 If letters, numbers and symbols are included
(defrule yeslns
    ?fw<- (letnumsyb (value ?val &: (eq ?val yes)))
    =>
    (bind ?*lns* 100)
    )

;12 If letters, numbers and symbols are not present
(defrule nolns
    ?fw<- (letnumsyb (value ?val &: (eq ?val no)))
    =>
    (bind ?*lns* 50)
    )


;-----------------------------
;5. Is a keyboard walk or not
;-----------------------------

(deftemplate keyboardwalk (slot value))
(defglobal ?*keybwalk* = "not def")

;13 If user has keyboard walk password
(defrule kbwalk
    ?fw<- (keyboardwalk (value ?val &: (eq ?val yes)))
    =>
    (bind ?*keybwalk* 50)
    )


;14 If user does not have keyobard walk password
(defrule notkbwalk
    ?fw<- (keyboardwalk (value ?val &: (eq ?val no)))
    =>
    (bind ?*keybwalk* 100)
    )

;-------------------------------
;6. If the word is in dictioanry
;-------------------------------

(deftemplate dictionary (slot value))
(defglobal ?*dictpass* = "no def")

;5 If password is there in the dictionary
(defrule isindictionary
     ?fw<- (dictionary (value ?val &: (eq ?val yes)))
    =>
    (bind ?*dictpass* 50)
    )

;16 If password is not in the dictionary
(defrule isnotdictionary
     ?fw<- (dictionary (value ?val &: (eq ?val no)))
    =>
    (bind ?*dictpass* 100)
    )


;-----------------------------------
;7. How often do you reset password
;-----------------------------------

(deftemplate resetpassword (slot value))
(defglobal ?*resetp* = "no def")

;17 everymonth
(defrule reseteachmonth
    (resetpassword (value ?v&: (eq ?v 0) ))
    =>
    (bind ?*resetp* 100)
    )

;18 Once in 1-3 months
(defrule resetonethree
    ?r<- (resetpassword {value <= 3 && value > 1} )
    =>
    (bind ?*resetp* 80)
    )


;19 Once in six months
(defrule resetsix
    ?r<- (resetpassword {value == 6} )
    =>
    (bind ?*resetp* 60)
    )


;20 Greater than 6
(defrule resetgreater
    ?r<- (resetpassword {value > 6} )
    =>
    (bind ?*resetp* 40)
    )


;------------------------------------------
;RULE for identification and authentication
;-------------------------------------------

; 8. Total number of users
;--------------------------

(deftemplate totalusers (slot value))
(defglobal ?*usercount* = "not defined")

;21 If only one user
(defrule oneurser
    ?r<- (totalusers {value == 1} )
    =>
    (bind ?*usercount* 100)

    )

;22 If one guest user also there.
(defrule twourser
    ?r<- (totalusers {value == 2} )
    =>
    (bind ?*usercount* 75)

    )

;22 If more than 2 users
(defrule moreurser
    ?r<- (totalusers {value > 2} )
    =>
    (bind ?*usercount* 50)

    )


;-------------------------------------
; RULES FOR APPLICATION VULNERABILITY
;-------------------------------------

;------------------
; 9. Which browser
;------------------

(deftemplate browser (slot value))
(defglobal ?*browsername* = "not defined")

;23 Firefox
(defrule firefox
   ?r<- (browser {value == 1} )
    =>
    (bind ?*browsername* 100)

    )

;24 Google chrome
(defrule chrome
   ?r<- (browser {value == 2} )
     =>
    (bind ?*browsername* 75)

    )

;25 Internet explorer
(defrule ie
   ?r<- (browser {value == 3} )
       =>
    (bind ?*browsername* 50)

    )

;------------------
;FIREWALL HIERARCHY RULES
;-----------------
(deftemplate firewall (slot value))
(defglobal ?*firewallchoice* = "not def")
(deftemplate firhierarchy (slot val))

;26 If firewall is installed
(defrule firwallinstall
    ?fw<- (firewall (value ?val &: (eq ?val yes)))
    =>
    (assert(firhierarchy(val 100)))
        	;(bind ?*firewallchoice* 100)

    )




(deftemplate firewalltypes (slot value))
;(defglobal ?*firewalltype* = "not def")

(deftemplate numfirewall (slot value))
;;FOR EVERY TYPE OF FIREWALL
;;--------------------------

(defrule numwindows
    ?fw<- (firewalltypes (value ?val &: (eq ?val Windows)))

    =>
    (assert(numfirewall(value 100)))
        	;(bind ?*firewallchoice* 100)

    )

(defrule numpersonal
    ?fw<- (firewalltypes (value ?val &: (eq ?val Personal)))

    =>
    (assert(numfirewall(value 80)))
        	;(bind ?*firewallchoice* 100)
    )




;27 If YES- For windows
(defrule firewallwindows
   ?r<- (firhierarchy {val == 100})
    ( numfirewall {value == 100})

      =>
    	(bind ?*firewallchoice* 100)
    )

;28 If YES- For personal firewall
(defrule firewallpersonal
   ?y<- (firhierarchy {val == 100})
    ( numfirewall {value == 80})
    =>
    (bind ?*firewallchoice* 80)
    )
; Numerical value for zone-alarm
(defrule numzone
    ?fw<- (firewalltypes (value ?val &: (eq ?val Zone Alarm)))

    =>
    (assert(numfirewall(value 60)))
        	;(bind ?*firewallchoice* 100)
    )



;29 If YES- For zone-alarm
(defrule firewallzone_alarm
  ?v<- (firhierarchy {val == 100})
    ( numfirewall {value == 60})
    =>
    (bind ?*firewallchoice* 60)
    )


;Numerical value for anti-virus

(defrule numanti
    ?fw<- (firewalltypes (value ?val &: (eq ?val Anti Virus)))

    =>
    (assert(numfirewall(value 40)))
        	;(bind ?*firewallchoice* 100)
    )


;30 If YES- For anti-virus
(defrule firewallanti_virus
  ?r<- (firhierarchy {val == 100})
    ( numfirewall {value == 40})
    =>
    (bind ?*firewallchoice* 40)
    )

;31 If No (firewall not installed)
(defrule firwallnotinstalled
    ?fw<- (firewall (value ?val &: (eq ?val no)))
    =>
    (bind ?*firewallchoice* 0)
    )


;-----------------------------------------
; INSTALL SECURITY PATCHES HIERARCHY RULES
;-----------------------------------------

(deftemplate securitypatches (slot value))
(defglobal ?*spatches* = "not def")
(deftemplate securityhierarchy (slot value))

;32 If security patches are installed
(defrule securitypresent
    ?fw<- (securitypatches (value ?val &: (eq ?val yes)))
    =>
    (assert(securityhierarchy(value 100)))
    ;    (bind ?*spatches* 75)

    )


; template for heirarchical options with globally declared value
(deftemplate securitytypes (slot value))
(defglobal ?*stype* = "not def")

;HOW IT IS ORGANIZED
;-------------------

(deftemplate numpatches (slot value))
(deftemplate numsecurity (slot value))

(defrule numauto
    ?fw<- (securitytypes (value ?val &: (eq ?val 1)))

    =>
    (assert(numsecurity(value 75)))
        	;(bind ?*firewallchoice* 100)
           (bind ?*spatches* 75)

    )



;33 If YES- Autoinstall
(defrule autoinstall
   ?v<- (securityhierarchy {value == 100})
    ( numsecurity {value == 75})
    =>
    (bind ?*spatches* 75)
    )


(defrule numuser
    ?fw<- (securitytypes (value ?val &: (eq ?val 2)))

    =>
        (assert(numsecurity(value 100)))
           (bind ?*spatches* 100)

    )

;34 If YES- User Install
(defrule userinstall
   ?v<- (securityhierarchy {value == 100})
    ( numsecurity {value == 100})

    =>

    (bind ?*spatches* 100)
    )



(defrule nummanual
    ?fw<- (securitytypes (value ?val &: (eq ?val 3)))

    =>
    (assert(numsecurity(value 50)))
        	;(bind ?*firewallchoice* 100)
           (bind ?*spatches* 50)

    )


;35 If YES- Manual install
(defrule manualinstall
 ?v<- (securityhierarchy {value == 100})
    ( numsecurity {value == 50})

    =>

    (bind ?*spatches* 50)
    )

;36 Patches not installed
(defrule patchesnotinstalled
    ?fw <- (securitypatches (value ?val &: (eq ?val no)))
    =>
    (bind ?*spatches* 0)
    )


;-------------------------------
;Use peer to peer file system
;-------------------------------


(deftemplate peertopeer (slot value))
(defglobal ?*ptop* = "not def")

;37 If there is peer to peer transfer
(defrule ptotp
    ?fw<- (peertopeer (value ?val &: (eq ?val yes)))
    =>
    (bind ?*ptop* 50)
    )

;38 If there is no peer to peer transfer
(defrule noptotp
    ?fw<- (peertopeer (value ?val &: (eq ?val no)))
    =>
    (bind ?*ptop* 100)
    )



;------------------------
; OS Name
;windows, linux, apple OS
;------------------------

(deftemplate osname (slot value))
(defglobal ?*oname* = "no def")
(defrule windows
    ?v<- ( osname (value ?val &: (eq ?val Windows)))
    =>
    (bind ?*oname* 100)
    )

(defrule linux
    ?v<- ( osname (value ?val &: (eq ?val Linux)))
    =>
    (bind ?*oname* 75)
    )

(defrule apple
    ?v<- ( osname (value ?val &: (eq ?val Apple)))
    =>
    (bind ?*oname* 50)

    )
