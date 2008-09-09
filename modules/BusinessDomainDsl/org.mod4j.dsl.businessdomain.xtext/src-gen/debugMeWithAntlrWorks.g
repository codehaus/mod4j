grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleBusinessDomainModel EOF
;

ruleBusinessDomainModel  :
((temp_description=RULE_STRING )?

('Model')

(temp_name=RULE_ID )

(temp_types=ruleBusinessClassReference )*

(temp_types=ruleBusinessClass )*

(temp_enumerations=ruleEnumeration )*

(temp_associations=ruleAssociation )*
)
;

ruleBusinessClassReference  :
(('import')

(temp_name=RULE_ID )
)
;

ruleAssociation  :
((temp_description=RULE_STRING )?

('Association')

(temp_sourceRoleName=RULE_ID )

(temp_source=RULE_ID
)

('[')

(temp_sourceMultiplicity=ruleMultiplicity )

(']')

((temp_bidirectional='<->' )
	|
('->')
)

('[')

(temp_targetMultiplicity=ruleMultiplicity )

(']')

(temp_targetRoleName=RULE_ID )

(temp_target=RULE_ID
)

(';')
)
;

ruleMultiplicity  :
			
		 '0..*'
		 
	 |			
		 '1'
		 
	 |			
		 '1..*'
		 
	 |			
		 '0..1'
		 
;

ruleBusinessClass  :
((temp_description=RULE_STRING )?

('Class')

(temp_name=RULE_ID )

(temp_inheritanceModifier=ruleInheritanceModifier )?

(('inherits')

(temp_superclass=RULE_ID
)
)?

('[')

(temp_properties=ruleProperty )*

(('Rules')

('[')

(temp_businessRules=ruleAbstractBusinessRule )*

(']')
)?

(']')
)
;

ruleEnumeration  :
((temp_description=RULE_STRING )?

('Enumeration')

(temp_name=RULE_ID )

('[')

(temp_enumerationLiterals=ruleEnumerationLiteral )+

(']')
)
;

ruleEnumerationLiteral  :
((temp_name=RULE_ID )

(('=')

(temp_persistedValue=RULE_INT )
)?

(';')
)
;

ruleAbstractBusinessRule  :
        temp_businessrule=ruleBusinessRule 	|        temp_uniquerule=ruleUniqueRule 	;

ruleBusinessRule  :
((temp_description=RULE_STRING )?

(temp_name=RULE_ID )

(';')
)
;

ruleUniqueRule  :
((temp_description=RULE_STRING )?

('unique')

(temp_name=RULE_ID )

('[')

(temp_properties=RULE_ID
)+

(']')

(';')
)
;

ruleInheritanceModifier  :
			
		 'abstract'
		 
	 |			
		 'final'
		 
;

ruleProperty  :
(((
temp_BoolProperty=ruleBoolProperty {$result=temp_BoolProperty;}
)
	|
(
temp_StringProperty=ruleStringProperty {$result=temp_StringProperty;}
)
	|
(
temp_DateTimeProperty=ruleDateTimeProperty {$result=temp_DateTimeProperty;}
)
	|
(
temp_IntegerProperty=ruleIntegerProperty {$result=temp_IntegerProperty;}
)
	|
(
temp_DecimalProperty=ruleDecimalProperty {$result=temp_DecimalProperty;}
)
	|
(
temp_EnumerationProperty=ruleEnumerationProperty {$result=temp_EnumerationProperty;}
)
)

(temp_nullable='nullable' )?

(('persistency')

(temp_persistency=rulePersistencyMode )
)?

(';')
)
;

ruleBoolProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='boolean' )

(temp_name=RULE_ID )

((temp_hasDefault='default' )

((temp_defaultValue='true' )
	|
('false')
)
)?
)
;

ruleStringProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='string' )

(temp_name=RULE_ID )

((temp_hasDefault='default' )

(temp_defaultValue=RULE_STRING )
)?

(('minlength')

(temp_minLength=RULE_INT )
)?

(('maxlength')

(temp_maxLength=RULE_INT )
)?

(('regexp')

(temp_regularExpression=RULE_STRING )
)?
)
;

ruleDateTimeProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='datetime' )

(temp_accuracy=ruleDateTimeAccuracy )

(temp_name=RULE_ID )

((temp_hasDefault='default' )

(temp_defaultValue=RULE_STRING )
)?
)
;

ruleDateTimeAccuracy  :
			
		 'month'
		 
	 |			
		 'year'
		 
	 |			
		 'day'
		 
	 |			
		 'hour'
		 
	 |			
		 'minute'
		 
	 |			
		 'second'
		 
	 |			
		 'millisecond'
		 
;

ruleIntegerProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='integer' )

(temp_name=RULE_ID )

((temp_hasDefault='default' )

(temp_defaultValue=RULE_INT )
)?

(('min')

(temp_minValue=RULE_INT )
)?

(('max')

(temp_maxValue=RULE_INT )
)?
)
;

ruleDecimalProperty  :
((temp_description=RULE_STRING )?

(temp_dataType='decimal' )

(temp_name=RULE_ID )
)
;

ruleEnumerationProperty  :
((temp_description=RULE_STRING )?

(temp_type=RULE_ID
)

(temp_name=RULE_ID )

((temp_hasDefault='default' )

(temp_defaultValueAsString=RULE_ID )
)?
)
;

rulePersistencyMode  :
			
		 'ReadWrite'
		 
	 |			
		 'Read'
		 
	 |			
		 'NONE'
		 
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
