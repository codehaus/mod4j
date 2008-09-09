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

(temp_crudServices=ruleCrudService )*

(temp_methods=ruleServiceMethod )*

('end')
)
;

ruleDtoReference  :
(('import')

(temp_name=RULE_ID )

(';')
)
;

ruleServiceMethod  :
        temp_custommethod=ruleCustomMethod 	|        temp_specialmethod=ruleSpecialMethod 	;

ruleCustomMethod  :
((temp_description=RULE_STRING )?

('method')

(temp_name=RULE_ID )

(('in')

(temp_input=RULE_ID
)
)?

(('out')

(temp_output=RULE_ID
)
)?

(';')
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
(('crud')

('for')

(temp_dto=RULE_ID
)

(';')
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
		 
	 |			
		 'custom'
		 
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

