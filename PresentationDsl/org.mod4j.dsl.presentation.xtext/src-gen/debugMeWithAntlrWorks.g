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

(('processes')

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

(('dialogues')

('[')

(temp_dialogues=ruleDialogueCall )*

(']')
)?

(('processes')

('[')

(temp_processes=ruleProcessCall )*

(']')
)?
)
	|
(
temp_CollectionDialogue=ruleCollectionDialogue {$result=temp_CollectionDialogue;}
)
	|
(
temp_MasterDetail=ruleMasterDetail {$result=temp_MasterDetail;}
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

(('dialogues')

('[')

(temp_dialogues=ruleDialogueCall )*

(']')
)?

(('processes')

('[')

(temp_processes=ruleProcessCall )*

(']')
)?
)
;

ruleMasterDetail  :
((temp_description=RULE_STRING )?

('MasterDetail')

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

('master')

(temp_master=ruleDialogueCall )

(';')

('detail')

(temp_detail=ruleDialogueCall )

(';')

(('processes')

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
(('formElement')

(('navigate')

(
temp_LinkRef=ruleLinkRef {$result=temp_LinkRef;}
)

('to')
)?

(temp_references=ruleDtoPropertyReference )

('named')

(temp_name=RULE_ID )

(('readonly')

((temp_readonly='true' )
	|
('false')
)
)?

(';')
)
;

ruleDialogueCall  :
        temp_directdialoguecall=ruleDirectDialogueCall 	|        temp_linkeddialoguecall=ruleLinkedDialogueCall 	;

ruleLinkedDialogueCall  :
(('navigate')

(temp_link=ruleLinkRef )

('to')

(temp_name=RULE_ID )

(';')
)
;

ruleDirectDialogueCall  :
((temp_name=RULE_ID )

(';')
)
;

ruleProcessCall  :
((temp_name=RULE_ID )

(';')
)
;

ruleLinkRef  :
(temp_name=RULE_ID )
;

ruleLink  :
        temp_linkstep=ruleLinkStep 	|        temp_linkpath=ruleLinkPath 	;

ruleLinkStep  :
((temp_description=RULE_STRING )?

('LinkStep')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)

('navigate')

(temp_reference=ruleAssociationRoleReference )
)
;

ruleLinkPath  :
((temp_description=RULE_STRING )?

('LinkPath')

(temp_name=RULE_ID )

('using')

(temp_contextRef=RULE_ID
)
)
;

ruleDtoPropertyReference  :
(temp_name=RULE_ID )
;

ruleAssociationRoleReference  :
(temp_name=RULE_ID )
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

