# Java Regular Expression User Name

## Rules

* Must be start with alphabet
* Only allow alphabet and _ (underscore)
* Minimum 3 char are requires
 

## Expression: ^(\+?\d{2})?(\s+)?(\d{10})\b

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
