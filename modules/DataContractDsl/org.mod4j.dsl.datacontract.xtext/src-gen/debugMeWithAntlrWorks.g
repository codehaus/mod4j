grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleDataContractModel EOF
;

ruleDataContractModel  :
((temp_description=RULE_STRING )?

('datacontract')

(temp_name=RULE_ID )

(';')

(temp_externalReferences=ruleExternalReference )*

((temp_dtos=ruleDto )
	|
(temp_enumerations=ruleEnumerationDto )
)*
)
;

ruleDto  :
        temp_businessclassdto=ruleBusinessClassDto 	|        temp_listdto=ruleListDto 	|        temp_customdto=ruleCustomDto 	;

ruleExternalReference  :
((temp_description=RULE_STRING )?

('from')

(temp_modelname=RULE_ID )

('import')

(temp_name=RULE_ID )

(';')
)
;

ruleBusinessClassDto  :
((temp_description=RULE_STRING )?

('class')

(temp_name=RULE_ID )

('represents')

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
((temp_description=RULE_STRING )?

('enumeration')

(temp_name=RULE_ID )

('represents')

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
((temp_name=RULE_ID )

('as')

(temp_dtoType=RULE_ID
)

(';')
)
;

ruleListDto  :
((temp_description=RULE_STRING )?

('list')

(temp_name=RULE_ID )

('contains')

(temp_baseDto=RULE_ID
)
)
;

ruleCustomDto  :
((temp_description=RULE_STRING )?

('custom')

(temp_name=RULE_ID )

('[')

(temp_properties=ruleDtoProperty )+

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

