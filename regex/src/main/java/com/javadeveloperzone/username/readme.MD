# Java Regular Expression User Name

## Rules

* Must be start with alphabet
* Only allow alphabet and _ (underscore)
* Minimum 3 char are requires
 

## Expression: ^([a-zA-Z])+([\w]{2,})+$

NOTE: 
* If you want to allowed any special characters in user name then add that special char after \w like:
    * Example 1(allow @): ^([a-zA-Z])+([\w@]{2,})+$
    * Example 2(allow @ and %): ^([a-zA-Z])+([\w@%]{2,})+$
* If you want to increase minimum limit then replace that number-1 with 2 in expression
    * Minimum 5 char: ^([a-zA-Z])+([\w@]{4,})+$


### Valid User Name:
* john
* John1990
* john_Harry
* john_harry_1990
* john_HARRY
* jon
 
### Invalid User Name
*  _john
* john Harry
* 12584_harry
* @_harry
* john_HARRY_@_1990
* jo

Source code : [UserNameRegx.java](UserNameRegx.java)
