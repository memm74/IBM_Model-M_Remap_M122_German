macroblock

#sets F21 to ALT PRINTSCREEN
 macro F21
    PUSH_META CLEAR_META all
    MAKE LALT
    PRESS PRINTSCREEN
    BREAK LALT
    POP_ALL_META
 endmacro
 
#Sets Extra_F2 to Windows (LGUI)+E (Windows Explorer)
 macro EXTRA_F2
    PUSH_META CLEAR_META all
    MAKE LGUI
    PRESS E
    BREAK LGUI
    POP_ALL_META
 endmacro
 
#Sets Extra_F3 to CTRL+ LEFT (Word left)
 macro EXTRA_F3
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS LEFT
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets Extra_F4 to CTRL+ RIGHT (Word right)
 macro EXTRA_F4
    PUSH_META CLEAR_META all
    MAKE LCTRL
    PRESS RIGHT
    BREAK LCTRL
    POP_ALL_META
 endmacro
 
#Sets Extra_F6 to Windows (LGUI)+TAB (Task View: Windows logo key  + Tab)
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

 
endblock


remapblock

# Left-side function keys.
  
  EXTRA_F1      ESC
   
  EXTRA_F9 	    LGUI				 	


# ISO FIX
  EUROPE_1    BACKSLASH

# Top-side extra function keys.
  F13           MEDIA_VOLUME_UP
  F14           MEDIA_VOLUME_DOWN
  F15           MEDIA_MUTE
  F16           MEDIA_MUTE
  F17           MEDIA_PLAY_PAUSE
  F18           MEDIA_PREV_TRACK
  F19           MEDIA_NEXT_TRACK
  F20           MEDIA_STOP
  F22           PRINTSCREEN 
  F23           SCROLL_LOCK
  F24           PAUSE

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



