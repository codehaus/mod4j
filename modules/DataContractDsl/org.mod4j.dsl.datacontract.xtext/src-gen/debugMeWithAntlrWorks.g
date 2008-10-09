grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleDataContractModel EOF
;

ruleDataContractModel  :
((temp_description=RULE_STRING )?

('DataContract')

(temp_name=RULE_ID )

(temp_externalReferences=ruleExternalReference )*

(temp_dtos=ruleDto )*

(temp_enumerations=ruleEnumerationDto )*
)
;

ruleDto  :
((temp_description=RULE_STRING )?

((
temp_BusinessClassDto=ruleBusinessClassDto {$result=temp_BusinessClassDto;}
)
	|
(
temp_ListDto=ruleListDto {$result=temp_ListDto;}
)
	|
(
temp_CustomDto=ruleCustomDto {$result=temp_CustomDto;}
)
)
)
;

ruleExternalReference  :
((temp_description=RULE_STRING )?

('from')

(temp_modelname=RULE_ID )

('import')

(temp_name=RULE_ID )
)
;

ruleBusinessClassDto  :
(('BusinessClassDto')

(temp_name=RULE_ID )

('base')

(temp_base=RULE_ID
)

(('[')

(temp_propertyReferences=ruleBusinessClassPropertyReference )+

(('references')

('[')

(temp_associationReferences=ruleBusinessClassAssociationRoleReference )+

(']')
)?

(']')
)?
)
;

ruleEnumerationDto  :
(('EnumerationDto')

(temp_name=RULE_ID )

('base')

(temp_base=RULE_ID
)
)
;

ruleBusinessClassPropertyReference  :
((temp_name=RULE_ID )

(';')
)
;

ruleBusinessClassAssociationRoleReference  :
((temp_dtoType=RULE_ID
)

(temp_name=RULE_ID )

(';')
)
;

ruleListDto  :
(('ListDto')

(temp_name=RULE_ID )

('base')

(temp_baseDto=RULE_ID
)
)
;

ruleCustomDto  :
(('CustomDto')

(temp_name=RULE_ID )

('[')

(temp_properties=ruleDtoProperty )*

(']')
)
;

ruleDtoProperty  :
((temp_description=RULE_STRING )?

((
temp_DtoBooleanProperty=ruleDtoBooleanProperty {$result=temp_DtoBooleanProperty;}
)
	|
(
temp_DtoStringProperty=ruleDtoStringProperty {$result=temp_DtoStringProperty;}
)
	|
(
temp_DtoDateTimeProperty=ruleDtoDateTimeProperty {$result=temp_DtoDateTimeProperty;}
)
	|
(
temp_DtoIntegerProperty=ruleDtoIntegerProperty {$result=temp_DtoIntegerProperty;}
)
	|
(
temp_DtoDecimalProperty=ruleDtoDecimalProperty {$result=temp_DtoDecimalProperty;}
)
	|
(
temp_DtoEnumerationProperty=ruleDtoEnumerationProperty {$result=temp_DtoEnumerationProperty;}
)
)

(';')
)
;

ruleDtoBooleanProperty  :
((temp_dataType='boolean' )

(temp_name=RULE_ID )
)
;

ruleDtoStringProperty  :
((temp_dataType='string' )

(temp_name=RULE_ID )
)
;

ruleDtoDateTimeProperty  :
((temp_dataType='datetime' )

(temp_name=RULE_ID )
)
;

ruleDtoIntegerProperty  :
((temp_dataType='integer' )

(temp_name=RULE_ID )
)
;

ruleDtoDecimalProperty  :
((temp_dataType='decimal' )

(temp_name=RULE_ID )
)
;

ruleDtoEnumerationProperty  :
((temp_type=RULE_ID
)

(temp_name=RULE_ID )
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;
