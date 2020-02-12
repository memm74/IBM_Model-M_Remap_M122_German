macroblock
 
#Sets Extra_F2 to Windows (LGUI)+E (Windows Explorer) ("Expl")
 macro EXTRA_F2
    PUSH_META CLEAR_META all
    MAKE LGUI
    PRESS E
    BREAK LGUI
    POP_ALL_META
 endmacro
 
#Sets Extra_F3 to CTRL+ LEFT (Word left) ("Links")
 macro EXTRA_F3
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS LEFT
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets Extra_F4 to CTRL+ RIGHT (Word right) ("Rechts")
 macro EXTRA_F4
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS RIGHT
    BREAK LCTRL
    POP_ALL_META
 endmacro

#sets Extra_F5 to ALT PRINTSCREEN ("Druck") as key is prelabelled Druck
 macro Extra_F5 
    PUSH_META CLEAR_META all
    MAKE LALT
    PRESS PRINTSCREEN
    BREAK LALT
    POP_ALL_META
 endmacro

#Sets Extra_F6 to Windows (LGUI)+TAB (Task View: Windows logo key  + Tab) ("Aktive Anwendungen")
 macro EXTRA_F6
    PUSH_META CLEAR_META all
    MAKE LGUI
    PRESS TAB
    BREAK LGUI
    POP_ALL_META
 endmacro
  
#Sets Extra_F7 to CTRL+ X
 macro EXTRA_F7
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS X
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets EXTRA_F8 to CTRL+ V
 macro EXTRA_F8
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS V
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets EXTRA_F10 to  CTRL + C
 macro EXTRA_F10
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS C
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets F13 to  CTRL + F
 macro F13
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS F
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets F17 to Pound Sign ALT + 0163
 macro F17
    PUSH_META CLEAR_META all
	MAKE LALT
	PRESS PAD_0
	PRESS PAD_1
	PRESS PAD_6
	PRESS PAD_3
    BREAK LALT
    POP_ALL_META
 endmacro
 
#Sets F18 to Interrobang ALT + 8253 (if font supports)
 macro F18
    PUSH_META CLEAR_META all
	MAKE LALT
	PRESS PAD_8
	PRESS PAD_2
	PRESS PAD_5
	PRESS PAD_3
    BREAK LALT
    POP_ALL_META
 endmacro

endblock


remapblock

# Left-side function keys.
  
  EXTRA_F1      ESC  
  EXTRA_F9 	LGUI				 	


# ISO FIX
  EUROPE_1    BACKSLASH

# Top-side extra function keys.
  F15		PAUSE
  F16           MEDIA_MUTE
  F19           MEDIA_NEXT_TRACK
  F20           MEDIA_STOP
  F22           PRINTSCREEN 
  F23           SCROLL_LOCK


# Navigation cluster
  LANG_4        DOWN

# Numpad cluster, imitating a normal numpad. The extra key becomes a comma.

  ESC           NUM_LOCK
  NUM_LOCK      PAD_SLASH
  SCROLL_LOCK   PAD_ASTERIX
  EXTRA_SYSRQ   PAD_MINUS
  PAD_ASTERIX   PAD_PLUS
  PAD_MINUS     COMMA       
  PAD_PLUS      PAD_ENTER

endblock



