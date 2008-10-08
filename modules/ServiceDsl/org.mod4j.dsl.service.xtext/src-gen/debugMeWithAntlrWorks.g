grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleServiceModel EOF
;

ruleServiceModel  :
((temp_description=RULE_STRING )?

('Service')

(temp_name=RULE_ID )

(temp_dtoReferences=ruleDtoReference )*

((temp_crudServices=ruleCrudService )
	|
(temp_methods=ruleServiceMethod )
)*
)
;

ruleMethodType  :
			
		 'create'
		 
	 |			
		 'read'
		 
	 |			
		 'update'
		 
	 |			
		 'delete'
		 
;

ruleDtoReference  :
((temp_description=RULE_STRING )?

('from')

(temp_modelname=RULE_ID )

('import')

(temp_name=RULE_ID )
)
;

ruleServiceMethod  :
((temp_description=RULE_STRING )?

((
temp_CustomMethod=ruleCustomMethod {$result=temp_CustomMethod;}
)
	|
(
temp_SpecialMethod=ruleSpecialMethod {$result=temp_SpecialMethod;}
)
)
)
;

ruleCustomMethod  :
(('method')

(temp_name=RULE_ID )

(('in')

(temp_inParameters=ruleParameter )*
)?

(('out')

(temp_output=RULE_ID
)
)?

(';')
)
;

ruleParameter  :
((temp_type=RULE_ID
)

(temp_name=RULE_ID )
)
;

ruleSpecialMethod  :
((temp_type=ruleMethodType )

(temp_name=RULE_ID )

('for')

(temp_dto=RULE_ID
)

(';')
)
;

ruleCrudService  :
((temp_description=RULE_STRING )?

(temp_name='crud' )

('for')

(temp_dto=RULE_ID
)

(';')
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

