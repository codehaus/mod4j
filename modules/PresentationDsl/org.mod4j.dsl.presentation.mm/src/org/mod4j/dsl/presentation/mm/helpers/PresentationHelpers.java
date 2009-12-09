package org.mod4j.dsl.presentation.mm.helpers;

import java.util.List;

//import org.mod4j.crossx.broker.CrossxEnvironment;
//import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Process;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;

public class PresentationHelpers {

//    static public Symbol referredSymbol(UICall call) {
//        Symbol result = null;
//        List<Symbol> dialogues = CrossxEnvironment.findAllEverywhere("Dialogue");
//        for (Symbol symbol : dialogues) {
//            if( symbol.getName().equals(call.getName())){
//                result = symbol;
//                break;
//            }
//        }
//        return result;
//    }

    static public ContentForm referredContentForm(UICall call) {
        UIModelElement container = null;
        if( call instanceof DialogueCall ) {
            DialogueCall dcall = (DialogueCall)call;
            container = (dcall.getCompoundDialogue() != null ? dcall.getCompoundDialogue() : dcall.getProcess() );
        } else {
            container = call.getProcess();
        }
        if( container == null ) {
            return null;
        }
        for (ModelElementWithContext element : container.getPresentationModel().getElements()) {
            if( element instanceof ContentForm) {
                ContentForm result = (ContentForm)element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }

    static public CollectionDialogue referredCollectionDialogue(UICall call) {
        Process process = call.getProcess();
        if( process == null ) {
            return null;
        }
        for (ModelElementWithContext element : process.getPresentationModel().getElements()) {
            if( element instanceof CollectionDialogue ) {
                CollectionDialogue result = (CollectionDialogue )element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }
}
