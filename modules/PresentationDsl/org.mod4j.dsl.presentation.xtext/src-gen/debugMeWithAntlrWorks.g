grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=rulePresentationModel EOF
;

rulePresentationModel  :
((temp_description=RULE_STRING )?

('PresentationModel')

(temp_name=RULE_ID )

(temp_externalReferences=ruleExternalReference )*

(temp_elements=ruleModelElement )*
)
;

ruleExternalReference  :
(('from')

(temp_modelName=RULE_ID )

('import')

(temp_name=RULE_ID )
)
;

ruleModelElement  :
        temp_uimodelelement=ruleUIModelElement 	|        temp_link=ruleLink 	;

ruleUIModelElement  :
        temp_dialogue=ruleDialogue 	|        temp_process=ruleProcess 	;

ruleDialogue  :
        temp_contentform=ruleContentForm 	|        temp_compounddialogue=ruleCompoundDialogue 	;

ruleContentForm  :
((temp_description=RULE_STRING )?

('ContentForm')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)

(('readonly')

((temp_readonly='true' )
	|
('false')
)

(';')
)?

(temp_formElements=ruleFormElement )*

(('Processes')

('[')

(temp_processes=ruleProcessCall )*

(']')
)?
)
;

ruleCompoundDialogue  :
(((temp_description=RULE_STRING )?

('CompoundDialogue')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)

(('readonly')

((temp_readonly='true' )
	|
('false')
)

(';')
)?

(('Dialogues')

('[')

(temp_dialogues=ruleDialogueCall )*

(']')
)?

(('Processes')

('[')

(temp_processes=ruleProcessCall )*

(']')
)?
)
	|
(
temp_CollectionDialogue=ruleCollectionDialogue {$result=temp_CollectionDialogue;}
)
)
;

ruleCollectionDialogue  :
((temp_description=RULE_STRING )?

('CollectionDialogue')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)

(('readonly')

((temp_readonly='true' )
	|
('false')
)

(';')
)?

(('Dialogues')

('[')

(temp_dialogues=ruleDialogueCall )*

(']')
)?

(('Processes')

('[')

(temp_processes=ruleProcessCall )*

(']')
)?
)
;

ruleProcess  :
        temp_automatedprocess=ruleAutomatedProcess 	|        temp_interactiveprocess=ruleInteractiveProcess 	;

ruleAutomatedProcess  :
((temp_description=RULE_STRING )?

('AutomatedProcess')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)
)
;

ruleInteractiveProcess  :
((temp_description=RULE_STRING )?

('InteractiveProcess')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)
)
;

ruleFormElement  :
(('FormElement')

(temp_name=RULE_ID )

('references')

(temp_references=ruleDtoPropertyReference )

(('readonly')

((temp_readonly='true' )
	|
('false')
)

(';')
)?
)
;

ruleDtoPropertyReference  :
((temp_name=RULE_ID )

(';')
)
;

ruleDialogueCall  :
((('navigate')

(
temp_LinkRef=ruleLinkRef {$result=temp_LinkRef;}
)
)?

(temp_name=RULE_ID )

(';')
)
;

ruleProcessCall  :
((('navigate')

(
temp_LinkRef=ruleLinkRef {$result=temp_LinkRef;}
)
)?

(temp_name=RULE_ID )

(';')
)
;

ruleLinkRef  :
(temp_name=RULE_ID )
;

ruleLink  :
((temp_description=RULE_STRING )?

('Link')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)
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

