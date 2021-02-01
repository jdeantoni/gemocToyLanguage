package fr.unice.polytech.si5.toylanguage.concretesyntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.si5.toylanguage.concretesyntax.services.ToyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'Var'", "':'", "'='", "';'", "'-'", "'.'", "'E'", "'e'", "'->'", "'('", "'+'", "')'", "'Assign'", "'with'", "':='", "'['", "'|'", "']'", "'int'", "'double'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalToyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalToy.g"; }



     	private ToyGrammarAccess grammarAccess;

        public InternalToyParser(TokenStream input, ToyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ToyProgram";
       	}

       	@Override
       	protected ToyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleToyProgram"
    // InternalToy.g:65:1: entryRuleToyProgram returns [EObject current=null] : iv_ruleToyProgram= ruleToyProgram EOF ;
    public final EObject entryRuleToyProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToyProgram = null;


        try {
            // InternalToy.g:65:51: (iv_ruleToyProgram= ruleToyProgram EOF )
            // InternalToy.g:66:2: iv_ruleToyProgram= ruleToyProgram EOF
            {
             newCompositeNode(grammarAccess.getToyProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToyProgram=ruleToyProgram();

            state._fsp--;

             current =iv_ruleToyProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToyProgram"


    // $ANTLR start "ruleToyProgram"
    // InternalToy.g:72:1: ruleToyProgram returns [EObject current=null] : ( () otherlv_1= 'program' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedVariables_3_0= ruleVariable ) )* ( (lv_ownedStatements_4_0= ruleStatement ) )* ) ;
    public final EObject ruleToyProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedStatements_4_0 = null;



        	enterRule();

        try {
            // InternalToy.g:78:2: ( ( () otherlv_1= 'program' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedVariables_3_0= ruleVariable ) )* ( (lv_ownedStatements_4_0= ruleStatement ) )* ) )
            // InternalToy.g:79:2: ( () otherlv_1= 'program' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedVariables_3_0= ruleVariable ) )* ( (lv_ownedStatements_4_0= ruleStatement ) )* )
            {
            // InternalToy.g:79:2: ( () otherlv_1= 'program' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedVariables_3_0= ruleVariable ) )* ( (lv_ownedStatements_4_0= ruleStatement ) )* )
            // InternalToy.g:80:3: () otherlv_1= 'program' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedVariables_3_0= ruleVariable ) )* ( (lv_ownedStatements_4_0= ruleStatement ) )*
            {
            // InternalToy.g:80:3: ()
            // InternalToy.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToyProgramAccess().getToyProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getToyProgramAccess().getProgramKeyword_1());
            		
            // InternalToy.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalToy.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalToy.g:92:4: (lv_name_2_0= ruleEString )
            // InternalToy.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getToyProgramAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToyProgramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToy.g:110:3: ( (lv_ownedVariables_3_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalToy.g:111:4: (lv_ownedVariables_3_0= ruleVariable )
            	    {
            	    // InternalToy.g:111:4: (lv_ownedVariables_3_0= ruleVariable )
            	    // InternalToy.g:112:5: lv_ownedVariables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getToyProgramAccess().getOwnedVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ownedVariables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getToyProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedVariables",
            	    						lv_ownedVariables_3_0,
            	    						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalToy.g:129:3: ( (lv_ownedStatements_4_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==21||LA2_0==24||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalToy.g:130:4: (lv_ownedStatements_4_0= ruleStatement )
            	    {
            	    // InternalToy.g:130:4: (lv_ownedStatements_4_0= ruleStatement )
            	    // InternalToy.g:131:5: lv_ownedStatements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getToyProgramAccess().getOwnedStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedStatements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getToyProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedStatements",
            	    						lv_ownedStatements_4_0,
            	    						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToyProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalToy.g:152:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalToy.g:152:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalToy.g:153:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalToy.g:159:1: ruleStatement returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Assignment_1= ruleAssignment | this_ParallelAssignment_2= ruleParallelAssignment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Operation_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_ParallelAssignment_2 = null;



        	enterRule();

        try {
            // InternalToy.g:165:2: ( (this_Operation_0= ruleOperation | this_Assignment_1= ruleAssignment | this_ParallelAssignment_2= ruleParallelAssignment ) )
            // InternalToy.g:166:2: (this_Operation_0= ruleOperation | this_Assignment_1= ruleAssignment | this_ParallelAssignment_2= ruleParallelAssignment )
            {
            // InternalToy.g:166:2: (this_Operation_0= ruleOperation | this_Assignment_1= ruleAssignment | this_ParallelAssignment_2= ruleParallelAssignment )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    alt3=2;
                }
                else if ( (LA3_1==20) ) {
                    switch ( input.LA(3) ) {
                    case 27:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                    case 24:
                        {
                        alt3=2;
                        }
                        break;
                    case 21:
                        {
                        alt3=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
            case 24:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalToy.g:167:3: this_Operation_0= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_0=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToy.g:176:3: this_Assignment_1= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalToy.g:185:3: this_ParallelAssignment_2= ruleParallelAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getParallelAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelAssignment_2=ruleParallelAssignment();

                    state._fsp--;


                    			current = this_ParallelAssignment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleOperation"
    // InternalToy.g:197:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalToy.g:197:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalToy.g:198:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalToy.g:204:1: ruleOperation returns [EObject current=null] : (this_Addition_0= ruleAddition | this_Soustraction_1= ruleSoustraction ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject this_Soustraction_1 = null;



        	enterRule();

        try {
            // InternalToy.g:210:2: ( (this_Addition_0= ruleAddition | this_Soustraction_1= ruleSoustraction ) )
            // InternalToy.g:211:2: (this_Addition_0= ruleAddition | this_Soustraction_1= ruleSoustraction )
            {
            // InternalToy.g:211:2: (this_Addition_0= ruleAddition | this_Soustraction_1= ruleSoustraction )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==21) ) {
                        int LA4_2 = input.LA(4);

                        if ( (LA4_2==RULE_STRING) ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4==22) ) {
                                alt4=1;
                            }
                            else if ( (LA4_4==16) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_2==RULE_ID) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==22) ) {
                                alt4=1;
                            }
                            else if ( (LA4_5==16) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==21) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_STRING) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==22) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==22) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalToy.g:212:3: this_Addition_0= ruleAddition
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getAdditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Addition_0=ruleAddition();

                    state._fsp--;


                    			current = this_Addition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalToy.g:221:3: this_Soustraction_1= ruleSoustraction
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSoustractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Soustraction_1=ruleSoustraction();

                    state._fsp--;


                    			current = this_Soustraction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEString"
    // InternalToy.g:233:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalToy.g:233:47: (iv_ruleEString= ruleEString EOF )
            // InternalToy.g:234:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalToy.g:240:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalToy.g:246:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalToy.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalToy.g:247:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalToy.g:248:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalToy.g:256:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVariable"
    // InternalToy.g:267:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalToy.g:267:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalToy.g:268:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalToy.g:274:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Var' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleVarType ) ) otherlv_5= '=' ( (lv_initialValue_6_0= ruleEDouble ) ) (otherlv_7= ';' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_6_0 = null;



        	enterRule();

        try {
            // InternalToy.g:280:2: ( ( () otherlv_1= 'Var' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleVarType ) ) otherlv_5= '=' ( (lv_initialValue_6_0= ruleEDouble ) ) (otherlv_7= ';' )? ) )
            // InternalToy.g:281:2: ( () otherlv_1= 'Var' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleVarType ) ) otherlv_5= '=' ( (lv_initialValue_6_0= ruleEDouble ) ) (otherlv_7= ';' )? )
            {
            // InternalToy.g:281:2: ( () otherlv_1= 'Var' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleVarType ) ) otherlv_5= '=' ( (lv_initialValue_6_0= ruleEDouble ) ) (otherlv_7= ';' )? )
            // InternalToy.g:282:3: () otherlv_1= 'Var' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleVarType ) ) otherlv_5= '=' ( (lv_initialValue_6_0= ruleEDouble ) ) (otherlv_7= ';' )?
            {
            // InternalToy.g:282:3: ()
            // InternalToy.g:283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarKeyword_1());
            		
            // InternalToy.g:293:3: ( (lv_name_2_0= ruleEString ) )
            // InternalToy.g:294:4: (lv_name_2_0= ruleEString )
            {
            // InternalToy.g:294:4: (lv_name_2_0= ruleEString )
            // InternalToy.g:295:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getColonKeyword_3());
            		
            // InternalToy.g:316:3: ( (lv_type_4_0= ruleVarType ) )
            // InternalToy.g:317:4: (lv_type_4_0= ruleVarType )
            {
            // InternalToy.g:317:4: (lv_type_4_0= ruleVarType )
            // InternalToy.g:318:5: lv_type_4_0= ruleVarType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeVarTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_4_0=ruleVarType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.VarType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getEqualsSignKeyword_5());
            		
            // InternalToy.g:339:3: ( (lv_initialValue_6_0= ruleEDouble ) )
            // InternalToy.g:340:4: (lv_initialValue_6_0= ruleEDouble )
            {
            // InternalToy.g:340:4: (lv_initialValue_6_0= ruleEDouble )
            // InternalToy.g:341:5: lv_initialValue_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getInitialValueEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_initialValue_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"initialValue",
            						lv_initialValue_6_0,
            						"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalToy.g:358:3: (otherlv_7= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalToy.g:359:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalToy.g:368:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalToy.g:368:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalToy.g:369:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalToy.g:375:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalToy.g:381:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalToy.g:382:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalToy.g:382:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalToy.g:383:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalToy.g:383:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalToy.g:384:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalToy.g:390:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalToy.g:391:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalToy.g:411:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=18 && LA11_0<=19)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalToy.g:412:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalToy.g:412:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==19) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalToy.g:413:5: kw= 'E'
                            {
                            kw=(Token)match(input,18,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalToy.g:419:5: kw= 'e'
                            {
                            kw=(Token)match(input,19,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalToy.g:425:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalToy.g:426:5: kw= '-'
                            {
                            kw=(Token)match(input,16,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleAddition"
    // InternalToy.g:444:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalToy.g:444:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalToy.g:445:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalToy.g:451:1: ruleAddition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '+' ( ( ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalToy.g:457:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '+' ( ( ruleEString ) ) otherlv_6= ')' ) )
            // InternalToy.g:458:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '+' ( ( ruleEString ) ) otherlv_6= ')' )
            {
            // InternalToy.g:458:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '+' ( ( ruleEString ) ) otherlv_6= ')' )
            // InternalToy.g:459:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '+' ( ( ruleEString ) ) otherlv_6= ')'
            {
            // InternalToy.g:459:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalToy.g:460:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // InternalToy.g:460:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalToy.g:461:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalToy.g:461:5: (lv_name_0_0= RULE_ID )
                    // InternalToy.g:462:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getAdditionAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalToy.g:487:3: ( ( ruleEString ) )
            // InternalToy.g:488:4: ( ruleEString )
            {
            // InternalToy.g:488:4: ( ruleEString )
            // InternalToy.g:489:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAdditionAccess().getLeftVariableVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getPlusSignKeyword_3());
            		
            // InternalToy.g:507:3: ( ( ruleEString ) )
            // InternalToy.g:508:4: ( ruleEString )
            {
            // InternalToy.g:508:4: ( ruleEString )
            // InternalToy.g:509:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAdditionAccess().getRightVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAdditionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSoustraction"
    // InternalToy.g:531:1: entryRuleSoustraction returns [EObject current=null] : iv_ruleSoustraction= ruleSoustraction EOF ;
    public final EObject entryRuleSoustraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoustraction = null;


        try {
            // InternalToy.g:531:53: (iv_ruleSoustraction= ruleSoustraction EOF )
            // InternalToy.g:532:2: iv_ruleSoustraction= ruleSoustraction EOF
            {
             newCompositeNode(grammarAccess.getSoustractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoustraction=ruleSoustraction();

            state._fsp--;

             current =iv_ruleSoustraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoustraction"


    // $ANTLR start "ruleSoustraction"
    // InternalToy.g:538:1: ruleSoustraction returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '-' ( ( ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleSoustraction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalToy.g:544:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '-' ( ( ruleEString ) ) otherlv_6= ')' ) )
            // InternalToy.g:545:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '-' ( ( ruleEString ) ) otherlv_6= ')' )
            {
            // InternalToy.g:545:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '-' ( ( ruleEString ) ) otherlv_6= ')' )
            // InternalToy.g:546:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= '-' ( ( ruleEString ) ) otherlv_6= ')'
            {
            // InternalToy.g:546:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalToy.g:547:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // InternalToy.g:547:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalToy.g:548:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalToy.g:548:5: (lv_name_0_0= RULE_ID )
                    // InternalToy.g:549:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getSoustractionAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSoustractionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getSoustractionAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSoustractionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalToy.g:574:3: ( ( ruleEString ) )
            // InternalToy.g:575:4: ( ruleEString )
            {
            // InternalToy.g:575:4: ( ruleEString )
            // InternalToy.g:576:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoustractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSoustractionAccess().getLeftVariableVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSoustractionAccess().getHyphenMinusKeyword_3());
            		
            // InternalToy.g:594:3: ( ( ruleEString ) )
            // InternalToy.g:595:4: ( ruleEString )
            {
            // InternalToy.g:595:4: ( ruleEString )
            // InternalToy.g:596:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoustractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSoustractionAccess().getRightVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSoustractionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSoustraction"


    // $ANTLR start "entryRuleAssignment"
    // InternalToy.g:618:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalToy.g:618:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalToy.g:619:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalToy.g:625:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_operation_5_0 = null;

        EObject lv_operation_8_0 = null;



        	enterRule();

        try {
            // InternalToy.g:631:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) ) ) )
            // InternalToy.g:632:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) ) )
            {
            // InternalToy.g:632:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) ) )
            // InternalToy.g:633:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) )
            {
            // InternalToy.g:633:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==20) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalToy.g:634:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // InternalToy.g:634:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalToy.g:635:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalToy.g:635:5: (lv_name_0_0= RULE_ID )
                    // InternalToy.g:636:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalToy.g:657:3: ( (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) ) | ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalToy.g:658:4: (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) )
                    {
                    // InternalToy.g:658:4: (otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) ) )
                    // InternalToy.g:659:5: otherlv_2= 'Assign' ( ( ruleEString ) ) otherlv_4= 'with' ( (lv_operation_5_0= ruleOperation ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getAssignKeyword_1_0_0());
                    				
                    // InternalToy.g:663:5: ( ( ruleEString ) )
                    // InternalToy.g:664:6: ( ruleEString )
                    {
                    // InternalToy.g:664:6: ( ruleEString )
                    // InternalToy.g:665:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_23); 

                    					newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getWithKeyword_1_0_2());
                    				
                    // InternalToy.g:683:5: ( (lv_operation_5_0= ruleOperation ) )
                    // InternalToy.g:684:6: (lv_operation_5_0= ruleOperation )
                    {
                    // InternalToy.g:684:6: (lv_operation_5_0= ruleOperation )
                    // InternalToy.g:685:7: lv_operation_5_0= ruleOperation
                    {

                    							newCompositeNode(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_operation_5_0=ruleOperation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    							}
                    							set(
                    								current,
                    								"operation",
                    								lv_operation_5_0,
                    								"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Operation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:704:4: ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) )
                    {
                    // InternalToy.g:704:4: ( ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) ) )
                    // InternalToy.g:705:5: ( ( ruleEString ) ) otherlv_7= ':=' ( (lv_operation_8_0= ruleOperation ) )
                    {
                    // InternalToy.g:705:5: ( ( ruleEString ) )
                    // InternalToy.g:706:6: ( ruleEString )
                    {
                    // InternalToy.g:706:6: ( ruleEString )
                    // InternalToy.g:707:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_1_0_0());
                    						
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_23); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1_1());
                    				
                    // InternalToy.g:725:5: ( (lv_operation_8_0= ruleOperation ) )
                    // InternalToy.g:726:6: (lv_operation_8_0= ruleOperation )
                    {
                    // InternalToy.g:726:6: (lv_operation_8_0= ruleOperation )
                    // InternalToy.g:727:7: lv_operation_8_0= ruleOperation
                    {

                    							newCompositeNode(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_operation_8_0=ruleOperation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    							}
                    							set(
                    								current,
                    								"operation",
                    								lv_operation_8_0,
                    								"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Operation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParallelAssignment"
    // InternalToy.g:750:1: entryRuleParallelAssignment returns [EObject current=null] : iv_ruleParallelAssignment= ruleParallelAssignment EOF ;
    public final EObject entryRuleParallelAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelAssignment = null;


        try {
            // InternalToy.g:750:59: (iv_ruleParallelAssignment= ruleParallelAssignment EOF )
            // InternalToy.g:751:2: iv_ruleParallelAssignment= ruleParallelAssignment EOF
            {
             newCompositeNode(grammarAccess.getParallelAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelAssignment=ruleParallelAssignment();

            state._fsp--;

             current =iv_ruleParallelAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelAssignment"


    // $ANTLR start "ruleParallelAssignment"
    // InternalToy.g:757:1: ruleParallelAssignment returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' ) ) ;
    public final EObject ruleParallelAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedAssignments_3_0 = null;

        EObject lv_ownedAssignments_5_0 = null;



        	enterRule();

        try {
            // InternalToy.g:763:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' ) ) )
            // InternalToy.g:764:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' ) )
            {
            // InternalToy.g:764:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' ) )
            // InternalToy.g:765:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )? (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' )
            {
            // InternalToy.g:765:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalToy.g:766:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->'
                    {
                    // InternalToy.g:766:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalToy.g:767:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalToy.g:767:5: (lv_name_0_0= RULE_ID )
                    // InternalToy.g:768:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getParallelAssignmentAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParallelAssignmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallelAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalToy.g:789:3: (otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']' )
            // InternalToy.g:790:4: otherlv_2= '[' ( (lv_ownedAssignments_3_0= ruleAssignment ) ) (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+ otherlv_6= ']'
            {
            otherlv_2=(Token)match(input,27,FOLLOW_21); 

            				newLeafNode(otherlv_2, grammarAccess.getParallelAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalToy.g:794:4: ( (lv_ownedAssignments_3_0= ruleAssignment ) )
            // InternalToy.g:795:5: (lv_ownedAssignments_3_0= ruleAssignment )
            {
            // InternalToy.g:795:5: (lv_ownedAssignments_3_0= ruleAssignment )
            // InternalToy.g:796:6: lv_ownedAssignments_3_0= ruleAssignment
            {

            						newCompositeNode(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_26);
            lv_ownedAssignments_3_0=ruleAssignment();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getParallelAssignmentRule());
            						}
            						add(
            							current,
            							"ownedAssignments",
            							lv_ownedAssignments_3_0,
            							"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Assignment");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalToy.g:813:4: (otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalToy.g:814:5: otherlv_4= '|' ( (lv_ownedAssignments_5_0= ruleAssignment ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_21); 

            	    					newLeafNode(otherlv_4, grammarAccess.getParallelAssignmentAccess().getVerticalLineKeyword_1_2_0());
            	    				
            	    // InternalToy.g:818:5: ( (lv_ownedAssignments_5_0= ruleAssignment ) )
            	    // InternalToy.g:819:6: (lv_ownedAssignments_5_0= ruleAssignment )
            	    {
            	    // InternalToy.g:819:6: (lv_ownedAssignments_5_0= ruleAssignment )
            	    // InternalToy.g:820:7: lv_ownedAssignments_5_0= ruleAssignment
            	    {

            	    							newCompositeNode(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_ownedAssignments_5_0=ruleAssignment();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getParallelAssignmentRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedAssignments",
            	    								lv_ownedAssignments_5_0,
            	    								"fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Assignment");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getParallelAssignmentAccess().getRightSquareBracketKeyword_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelAssignment"


    // $ANTLR start "ruleVarType"
    // InternalToy.g:847:1: ruleVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) ) ;
    public final Enumerator ruleVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalToy.g:853:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) ) )
            // InternalToy.g:854:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) )
            {
            // InternalToy.g:854:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalToy.g:855:3: (enumLiteral_0= 'int' )
                    {
                    // InternalToy.g:855:3: (enumLiteral_0= 'int' )
                    // InternalToy.g:856:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:863:3: (enumLiteral_1= 'double' )
                    {
                    // InternalToy.g:863:3: (enumLiteral_1= 'double' )
                    // InternalToy.g:864:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000009201032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000009200032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030000000L});

}