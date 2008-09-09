grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleDataContractModel EOF
;

ruleDataContractModel  :
(('DataContract')

(temp_name=RULE_ID )

(temp_domainClasses=ruleDomainClassReference )*

(temp_dtos=ruleDto )*
)
;

ruleDto  :
        temp_domainclassdto=ruleDomainClassDto 	|        temp_listdto=ruleListDto 	|        temp_customdto=ruleCustomDto 	;

ruleDomainClassReference  :
(('import')

(temp_name=RULE_ID )
)
;

ruleDomainClassDto  :
(('DomainDto')

(temp_name=RULE_ID )

('base')

(temp_base=RULE_ID
)

('[')

(temp_properties=ruleProperty )*

(']')
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

(temp_properties=ruleProperty )*

(']')
)
;

ruleProperty  :
(((
temp_BooleanProperty=ruleBooleanProperty {$result=temp_BooleanProperty;}
)
	|
(
temp_StringProperty=ruleStringProperty {$result=temp_StringProperty;}
)
)

(';')
)
;

ruleBooleanProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='boolean' )

(temp_name=RULE_ID )
)
;

ruleStringProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='string' )

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

