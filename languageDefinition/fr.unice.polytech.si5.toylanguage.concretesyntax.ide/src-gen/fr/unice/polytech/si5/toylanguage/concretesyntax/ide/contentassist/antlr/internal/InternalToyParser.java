package fr.unice.polytech.si5.toylanguage.concretesyntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.si5.toylanguage.concretesyntax.services.ToyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'int'", "'double'", "'program'", "'Var'", "':'", "'='", "';'", "'-'", "'.'", "'('", "'+'", "')'", "'->'", "'Assign'", "'with'", "':='", "'['", "']'", "'|'"
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

    	public void setGrammarAccess(ToyGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleToyProgram"
    // InternalToy.g:53:1: entryRuleToyProgram : ruleToyProgram EOF ;
    public final void entryRuleToyProgram() throws RecognitionException {
        try {
            // InternalToy.g:54:1: ( ruleToyProgram EOF )
            // InternalToy.g:55:1: ruleToyProgram EOF
            {
             before(grammarAccess.getToyProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleToyProgram();

            state._fsp--;

             after(grammarAccess.getToyProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToyProgram"


    // $ANTLR start "ruleToyProgram"
    // InternalToy.g:62:1: ruleToyProgram : ( ( rule__ToyProgram__Group__0 ) ) ;
    public final void ruleToyProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:66:2: ( ( ( rule__ToyProgram__Group__0 ) ) )
            // InternalToy.g:67:2: ( ( rule__ToyProgram__Group__0 ) )
            {
            // InternalToy.g:67:2: ( ( rule__ToyProgram__Group__0 ) )
            // InternalToy.g:68:3: ( rule__ToyProgram__Group__0 )
            {
             before(grammarAccess.getToyProgramAccess().getGroup()); 
            // InternalToy.g:69:3: ( rule__ToyProgram__Group__0 )
            // InternalToy.g:69:4: rule__ToyProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToyProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToyProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalToy.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalToy.g:79:1: ( ruleStatement EOF )
            // InternalToy.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalToy.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalToy.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalToy.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalToy.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalToy.g:94:3: ( rule__Statement__Alternatives )
            // InternalToy.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleOperation"
    // InternalToy.g:103:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalToy.g:104:1: ( ruleOperation EOF )
            // InternalToy.g:105:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalToy.g:112:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:116:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalToy.g:117:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalToy.g:117:2: ( ( rule__Operation__Alternatives ) )
            // InternalToy.g:118:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalToy.g:119:3: ( rule__Operation__Alternatives )
            // InternalToy.g:119:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEString"
    // InternalToy.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalToy.g:129:1: ( ruleEString EOF )
            // InternalToy.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalToy.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalToy.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalToy.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalToy.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalToy.g:144:3: ( rule__EString__Alternatives )
            // InternalToy.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVariable"
    // InternalToy.g:153:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalToy.g:154:1: ( ruleVariable EOF )
            // InternalToy.g:155:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalToy.g:162:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:166:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalToy.g:167:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalToy.g:167:2: ( ( rule__Variable__Group__0 ) )
            // InternalToy.g:168:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalToy.g:169:3: ( rule__Variable__Group__0 )
            // InternalToy.g:169:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalToy.g:178:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalToy.g:179:1: ( ruleEDouble EOF )
            // InternalToy.g:180:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalToy.g:187:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:191:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalToy.g:192:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalToy.g:192:2: ( ( rule__EDouble__Group__0 ) )
            // InternalToy.g:193:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalToy.g:194:3: ( rule__EDouble__Group__0 )
            // InternalToy.g:194:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleAddition"
    // InternalToy.g:203:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalToy.g:204:1: ( ruleAddition EOF )
            // InternalToy.g:205:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalToy.g:212:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:216:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalToy.g:217:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalToy.g:217:2: ( ( rule__Addition__Group__0 ) )
            // InternalToy.g:218:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalToy.g:219:3: ( rule__Addition__Group__0 )
            // InternalToy.g:219:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSoustraction"
    // InternalToy.g:228:1: entryRuleSoustraction : ruleSoustraction EOF ;
    public final void entryRuleSoustraction() throws RecognitionException {
        try {
            // InternalToy.g:229:1: ( ruleSoustraction EOF )
            // InternalToy.g:230:1: ruleSoustraction EOF
            {
             before(grammarAccess.getSoustractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSoustraction();

            state._fsp--;

             after(grammarAccess.getSoustractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSoustraction"


    // $ANTLR start "ruleSoustraction"
    // InternalToy.g:237:1: ruleSoustraction : ( ( rule__Soustraction__Group__0 ) ) ;
    public final void ruleSoustraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:241:2: ( ( ( rule__Soustraction__Group__0 ) ) )
            // InternalToy.g:242:2: ( ( rule__Soustraction__Group__0 ) )
            {
            // InternalToy.g:242:2: ( ( rule__Soustraction__Group__0 ) )
            // InternalToy.g:243:3: ( rule__Soustraction__Group__0 )
            {
             before(grammarAccess.getSoustractionAccess().getGroup()); 
            // InternalToy.g:244:3: ( rule__Soustraction__Group__0 )
            // InternalToy.g:244:4: rule__Soustraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoustractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoustraction"


    // $ANTLR start "entryRuleAssignment"
    // InternalToy.g:253:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalToy.g:254:1: ( ruleAssignment EOF )
            // InternalToy.g:255:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalToy.g:262:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:266:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalToy.g:267:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalToy.g:267:2: ( ( rule__Assignment__Group__0 ) )
            // InternalToy.g:268:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalToy.g:269:3: ( rule__Assignment__Group__0 )
            // InternalToy.g:269:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParallelAssignment"
    // InternalToy.g:278:1: entryRuleParallelAssignment : ruleParallelAssignment EOF ;
    public final void entryRuleParallelAssignment() throws RecognitionException {
        try {
            // InternalToy.g:279:1: ( ruleParallelAssignment EOF )
            // InternalToy.g:280:1: ruleParallelAssignment EOF
            {
             before(grammarAccess.getParallelAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelAssignment();

            state._fsp--;

             after(grammarAccess.getParallelAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParallelAssignment"


    // $ANTLR start "ruleParallelAssignment"
    // InternalToy.g:287:1: ruleParallelAssignment : ( ( rule__ParallelAssignment__Group__0 ) ) ;
    public final void ruleParallelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:291:2: ( ( ( rule__ParallelAssignment__Group__0 ) ) )
            // InternalToy.g:292:2: ( ( rule__ParallelAssignment__Group__0 ) )
            {
            // InternalToy.g:292:2: ( ( rule__ParallelAssignment__Group__0 ) )
            // InternalToy.g:293:3: ( rule__ParallelAssignment__Group__0 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getGroup()); 
            // InternalToy.g:294:3: ( rule__ParallelAssignment__Group__0 )
            // InternalToy.g:294:4: rule__ParallelAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelAssignment"


    // $ANTLR start "ruleVarType"
    // InternalToy.g:303:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:307:1: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalToy.g:308:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalToy.g:308:2: ( ( rule__VarType__Alternatives ) )
            // InternalToy.g:309:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalToy.g:310:3: ( rule__VarType__Alternatives )
            // InternalToy.g:310:4: rule__VarType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalToy.g:318:1: rule__Statement__Alternatives : ( ( ruleOperation ) | ( ruleAssignment ) | ( ruleParallelAssignment ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:322:1: ( ( ruleOperation ) | ( ruleAssignment ) | ( ruleParallelAssignment ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==25) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        alt1=3;
                        }
                        break;
                    case 22:
                        {
                        alt1=1;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                    case 26:
                        {
                        alt1=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA1_1==28) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case 26:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalToy.g:323:2: ( ruleOperation )
                    {
                    // InternalToy.g:323:2: ( ruleOperation )
                    // InternalToy.g:324:3: ruleOperation
                    {
                     before(grammarAccess.getStatementAccess().getOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:329:2: ( ruleAssignment )
                    {
                    // InternalToy.g:329:2: ( ruleAssignment )
                    // InternalToy.g:330:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalToy.g:335:2: ( ruleParallelAssignment )
                    {
                    // InternalToy.g:335:2: ( ruleParallelAssignment )
                    // InternalToy.g:336:3: ruleParallelAssignment
                    {
                     before(grammarAccess.getStatementAccess().getParallelAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParallelAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getParallelAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalToy.g:345:1: rule__Operation__Alternatives : ( ( ruleAddition ) | ( ruleSoustraction ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:349:1: ( ( ruleAddition ) | ( ruleSoustraction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==22) ) {
                        int LA2_2 = input.LA(4);

                        if ( (LA2_2==RULE_STRING) ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4==23) ) {
                                alt2=1;
                            }
                            else if ( (LA2_4==20) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 4, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA2_2==RULE_ID) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==20) ) {
                                alt2=2;
                            }
                            else if ( (LA2_5==23) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==22) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_STRING) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==23) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==20) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_2==RULE_ID) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==20) ) {
                        alt2=2;
                    }
                    else if ( (LA2_5==23) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalToy.g:350:2: ( ruleAddition )
                    {
                    // InternalToy.g:350:2: ( ruleAddition )
                    // InternalToy.g:351:3: ruleAddition
                    {
                     before(grammarAccess.getOperationAccess().getAdditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddition();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getAdditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:356:2: ( ruleSoustraction )
                    {
                    // InternalToy.g:356:2: ( ruleSoustraction )
                    // InternalToy.g:357:3: ruleSoustraction
                    {
                     before(grammarAccess.getOperationAccess().getSoustractionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSoustraction();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSoustractionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalToy.g:366:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:370:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalToy.g:371:2: ( RULE_STRING )
                    {
                    // InternalToy.g:371:2: ( RULE_STRING )
                    // InternalToy.g:372:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:377:2: ( RULE_ID )
                    {
                    // InternalToy.g:377:2: ( RULE_ID )
                    // InternalToy.g:378:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalToy.g:387:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:391:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalToy.g:392:2: ( 'E' )
                    {
                    // InternalToy.g:392:2: ( 'E' )
                    // InternalToy.g:393:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:398:2: ( 'e' )
                    {
                    // InternalToy.g:398:2: ( 'e' )
                    // InternalToy.g:399:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // InternalToy.g:408:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__Group_1_1__0 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:412:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalToy.g:413:2: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // InternalToy.g:413:2: ( ( rule__Assignment__Group_1_0__0 ) )
                    // InternalToy.g:414:3: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // InternalToy.g:415:3: ( rule__Assignment__Group_1_0__0 )
                    // InternalToy.g:415:4: rule__Assignment__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:419:2: ( ( rule__Assignment__Group_1_1__0 ) )
                    {
                    // InternalToy.g:419:2: ( ( rule__Assignment__Group_1_1__0 ) )
                    // InternalToy.g:420:3: ( rule__Assignment__Group_1_1__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_1()); 
                    // InternalToy.g:421:3: ( rule__Assignment__Group_1_1__0 )
                    // InternalToy.g:421:4: rule__Assignment__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives_1"


    // $ANTLR start "rule__VarType__Alternatives"
    // InternalToy.g:429:1: rule__VarType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:433:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalToy.g:434:2: ( ( 'int' ) )
                    {
                    // InternalToy.g:434:2: ( ( 'int' ) )
                    // InternalToy.g:435:3: ( 'int' )
                    {
                     before(grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalToy.g:436:3: ( 'int' )
                    // InternalToy.g:436:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalToy.g:440:2: ( ( 'double' ) )
                    {
                    // InternalToy.g:440:2: ( ( 'double' ) )
                    // InternalToy.g:441:3: ( 'double' )
                    {
                     before(grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // InternalToy.g:442:3: ( 'double' )
                    // InternalToy.g:442:4: 'double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarType__Alternatives"


    // $ANTLR start "rule__ToyProgram__Group__0"
    // InternalToy.g:450:1: rule__ToyProgram__Group__0 : rule__ToyProgram__Group__0__Impl rule__ToyProgram__Group__1 ;
    public final void rule__ToyProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:454:1: ( rule__ToyProgram__Group__0__Impl rule__ToyProgram__Group__1 )
            // InternalToy.g:455:2: rule__ToyProgram__Group__0__Impl rule__ToyProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ToyProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__0"


    // $ANTLR start "rule__ToyProgram__Group__0__Impl"
    // InternalToy.g:462:1: rule__ToyProgram__Group__0__Impl : ( () ) ;
    public final void rule__ToyProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:466:1: ( ( () ) )
            // InternalToy.g:467:1: ( () )
            {
            // InternalToy.g:467:1: ( () )
            // InternalToy.g:468:2: ()
            {
             before(grammarAccess.getToyProgramAccess().getToyProgramAction_0()); 
            // InternalToy.g:469:2: ()
            // InternalToy.g:469:3: 
            {
            }

             after(grammarAccess.getToyProgramAccess().getToyProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__0__Impl"


    // $ANTLR start "rule__ToyProgram__Group__1"
    // InternalToy.g:477:1: rule__ToyProgram__Group__1 : rule__ToyProgram__Group__1__Impl rule__ToyProgram__Group__2 ;
    public final void rule__ToyProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:481:1: ( rule__ToyProgram__Group__1__Impl rule__ToyProgram__Group__2 )
            // InternalToy.g:482:2: rule__ToyProgram__Group__1__Impl rule__ToyProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ToyProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__1"


    // $ANTLR start "rule__ToyProgram__Group__1__Impl"
    // InternalToy.g:489:1: rule__ToyProgram__Group__1__Impl : ( 'program' ) ;
    public final void rule__ToyProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:493:1: ( ( 'program' ) )
            // InternalToy.g:494:1: ( 'program' )
            {
            // InternalToy.g:494:1: ( 'program' )
            // InternalToy.g:495:2: 'program'
            {
             before(grammarAccess.getToyProgramAccess().getProgramKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getToyProgramAccess().getProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__1__Impl"


    // $ANTLR start "rule__ToyProgram__Group__2"
    // InternalToy.g:504:1: rule__ToyProgram__Group__2 : rule__ToyProgram__Group__2__Impl rule__ToyProgram__Group__3 ;
    public final void rule__ToyProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:508:1: ( rule__ToyProgram__Group__2__Impl rule__ToyProgram__Group__3 )
            // InternalToy.g:509:2: rule__ToyProgram__Group__2__Impl rule__ToyProgram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ToyProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__2"


    // $ANTLR start "rule__ToyProgram__Group__2__Impl"
    // InternalToy.g:516:1: rule__ToyProgram__Group__2__Impl : ( ( rule__ToyProgram__NameAssignment_2 ) ) ;
    public final void rule__ToyProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:520:1: ( ( ( rule__ToyProgram__NameAssignment_2 ) ) )
            // InternalToy.g:521:1: ( ( rule__ToyProgram__NameAssignment_2 ) )
            {
            // InternalToy.g:521:1: ( ( rule__ToyProgram__NameAssignment_2 ) )
            // InternalToy.g:522:2: ( rule__ToyProgram__NameAssignment_2 )
            {
             before(grammarAccess.getToyProgramAccess().getNameAssignment_2()); 
            // InternalToy.g:523:2: ( rule__ToyProgram__NameAssignment_2 )
            // InternalToy.g:523:3: rule__ToyProgram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ToyProgram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getToyProgramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__2__Impl"


    // $ANTLR start "rule__ToyProgram__Group__3"
    // InternalToy.g:531:1: rule__ToyProgram__Group__3 : rule__ToyProgram__Group__3__Impl rule__ToyProgram__Group__4 ;
    public final void rule__ToyProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:535:1: ( rule__ToyProgram__Group__3__Impl rule__ToyProgram__Group__4 )
            // InternalToy.g:536:2: rule__ToyProgram__Group__3__Impl rule__ToyProgram__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ToyProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__3"


    // $ANTLR start "rule__ToyProgram__Group__3__Impl"
    // InternalToy.g:543:1: rule__ToyProgram__Group__3__Impl : ( ( rule__ToyProgram__OwnedVariablesAssignment_3 )* ) ;
    public final void rule__ToyProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:547:1: ( ( ( rule__ToyProgram__OwnedVariablesAssignment_3 )* ) )
            // InternalToy.g:548:1: ( ( rule__ToyProgram__OwnedVariablesAssignment_3 )* )
            {
            // InternalToy.g:548:1: ( ( rule__ToyProgram__OwnedVariablesAssignment_3 )* )
            // InternalToy.g:549:2: ( rule__ToyProgram__OwnedVariablesAssignment_3 )*
            {
             before(grammarAccess.getToyProgramAccess().getOwnedVariablesAssignment_3()); 
            // InternalToy.g:550:2: ( rule__ToyProgram__OwnedVariablesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalToy.g:550:3: rule__ToyProgram__OwnedVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ToyProgram__OwnedVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getToyProgramAccess().getOwnedVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__3__Impl"


    // $ANTLR start "rule__ToyProgram__Group__4"
    // InternalToy.g:558:1: rule__ToyProgram__Group__4 : rule__ToyProgram__Group__4__Impl ;
    public final void rule__ToyProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:562:1: ( rule__ToyProgram__Group__4__Impl )
            // InternalToy.g:563:2: rule__ToyProgram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToyProgram__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__4"


    // $ANTLR start "rule__ToyProgram__Group__4__Impl"
    // InternalToy.g:569:1: rule__ToyProgram__Group__4__Impl : ( ( rule__ToyProgram__OwnedStatementsAssignment_4 )* ) ;
    public final void rule__ToyProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:573:1: ( ( ( rule__ToyProgram__OwnedStatementsAssignment_4 )* ) )
            // InternalToy.g:574:1: ( ( rule__ToyProgram__OwnedStatementsAssignment_4 )* )
            {
            // InternalToy.g:574:1: ( ( rule__ToyProgram__OwnedStatementsAssignment_4 )* )
            // InternalToy.g:575:2: ( rule__ToyProgram__OwnedStatementsAssignment_4 )*
            {
             before(grammarAccess.getToyProgramAccess().getOwnedStatementsAssignment_4()); 
            // InternalToy.g:576:2: ( rule__ToyProgram__OwnedStatementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==22||LA8_0==26||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalToy.g:576:3: rule__ToyProgram__OwnedStatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ToyProgram__OwnedStatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getToyProgramAccess().getOwnedStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalToy.g:585:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:589:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalToy.g:590:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalToy.g:597:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:601:1: ( ( () ) )
            // InternalToy.g:602:1: ( () )
            {
            // InternalToy.g:602:1: ( () )
            // InternalToy.g:603:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalToy.g:604:2: ()
            // InternalToy.g:604:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalToy.g:612:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:616:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalToy.g:617:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalToy.g:624:1: rule__Variable__Group__1__Impl : ( 'Var' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:628:1: ( ( 'Var' ) )
            // InternalToy.g:629:1: ( 'Var' )
            {
            // InternalToy.g:629:1: ( 'Var' )
            // InternalToy.g:630:2: 'Var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalToy.g:639:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:643:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalToy.g:644:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalToy.g:651:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:655:1: ( ( ( rule__Variable__NameAssignment_2 ) ) )
            // InternalToy.g:656:1: ( ( rule__Variable__NameAssignment_2 ) )
            {
            // InternalToy.g:656:1: ( ( rule__Variable__NameAssignment_2 ) )
            // InternalToy.g:657:2: ( rule__Variable__NameAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalToy.g:658:2: ( rule__Variable__NameAssignment_2 )
            // InternalToy.g:658:3: rule__Variable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalToy.g:666:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:670:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalToy.g:671:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalToy.g:678:1: rule__Variable__Group__3__Impl : ( ':' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:682:1: ( ( ':' ) )
            // InternalToy.g:683:1: ( ':' )
            {
            // InternalToy.g:683:1: ( ':' )
            // InternalToy.g:684:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalToy.g:693:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:697:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalToy.g:698:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalToy.g:705:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__TypeAssignment_4 ) ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:709:1: ( ( ( rule__Variable__TypeAssignment_4 ) ) )
            // InternalToy.g:710:1: ( ( rule__Variable__TypeAssignment_4 ) )
            {
            // InternalToy.g:710:1: ( ( rule__Variable__TypeAssignment_4 ) )
            // InternalToy.g:711:2: ( rule__Variable__TypeAssignment_4 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_4()); 
            // InternalToy.g:712:2: ( rule__Variable__TypeAssignment_4 )
            // InternalToy.g:712:3: rule__Variable__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalToy.g:720:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:724:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // InternalToy.g:725:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalToy.g:732:1: rule__Variable__Group__5__Impl : ( '=' ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:736:1: ( ( '=' ) )
            // InternalToy.g:737:1: ( '=' )
            {
            // InternalToy.g:737:1: ( '=' )
            // InternalToy.g:738:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__6"
    // InternalToy.g:747:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl rule__Variable__Group__7 ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:751:1: ( rule__Variable__Group__6__Impl rule__Variable__Group__7 )
            // InternalToy.g:752:2: rule__Variable__Group__6__Impl rule__Variable__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6"


    // $ANTLR start "rule__Variable__Group__6__Impl"
    // InternalToy.g:759:1: rule__Variable__Group__6__Impl : ( ( rule__Variable__InitialValueAssignment_6 ) ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:763:1: ( ( ( rule__Variable__InitialValueAssignment_6 ) ) )
            // InternalToy.g:764:1: ( ( rule__Variable__InitialValueAssignment_6 ) )
            {
            // InternalToy.g:764:1: ( ( rule__Variable__InitialValueAssignment_6 ) )
            // InternalToy.g:765:2: ( rule__Variable__InitialValueAssignment_6 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_6()); 
            // InternalToy.g:766:2: ( rule__Variable__InitialValueAssignment_6 )
            // InternalToy.g:766:3: rule__Variable__InitialValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Variable__InitialValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6__Impl"


    // $ANTLR start "rule__Variable__Group__7"
    // InternalToy.g:774:1: rule__Variable__Group__7 : rule__Variable__Group__7__Impl ;
    public final void rule__Variable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:778:1: ( rule__Variable__Group__7__Impl )
            // InternalToy.g:779:2: rule__Variable__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__7"


    // $ANTLR start "rule__Variable__Group__7__Impl"
    // InternalToy.g:785:1: rule__Variable__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Variable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:789:1: ( ( ( ';' )? ) )
            // InternalToy.g:790:1: ( ( ';' )? )
            {
            // InternalToy.g:790:1: ( ( ';' )? )
            // InternalToy.g:791:2: ( ';' )?
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_7()); 
            // InternalToy.g:792:2: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalToy.g:792:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__7__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalToy.g:801:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:805:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalToy.g:806:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalToy.g:813:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:817:1: ( ( ( '-' )? ) )
            // InternalToy.g:818:1: ( ( '-' )? )
            {
            // InternalToy.g:818:1: ( ( '-' )? )
            // InternalToy.g:819:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalToy.g:820:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalToy.g:820:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalToy.g:828:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:832:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalToy.g:833:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalToy.g:840:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:844:1: ( ( ( RULE_INT )? ) )
            // InternalToy.g:845:1: ( ( RULE_INT )? )
            {
            // InternalToy.g:845:1: ( ( RULE_INT )? )
            // InternalToy.g:846:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalToy.g:847:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalToy.g:847:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalToy.g:855:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:859:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalToy.g:860:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalToy.g:867:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:871:1: ( ( '.' ) )
            // InternalToy.g:872:1: ( '.' )
            {
            // InternalToy.g:872:1: ( '.' )
            // InternalToy.g:873:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalToy.g:882:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:886:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalToy.g:887:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalToy.g:894:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:898:1: ( ( RULE_INT ) )
            // InternalToy.g:899:1: ( RULE_INT )
            {
            // InternalToy.g:899:1: ( RULE_INT )
            // InternalToy.g:900:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalToy.g:909:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:913:1: ( rule__EDouble__Group__4__Impl )
            // InternalToy.g:914:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalToy.g:920:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:924:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalToy.g:925:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalToy.g:925:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalToy.g:926:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalToy.g:927:2: ( rule__EDouble__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalToy.g:927:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalToy.g:936:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:940:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalToy.g:941:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalToy.g:948:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:952:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalToy.g:953:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalToy.g:953:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalToy.g:954:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalToy.g:955:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalToy.g:955:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalToy.g:963:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:967:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalToy.g:968:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalToy.g:975:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:979:1: ( ( ( '-' )? ) )
            // InternalToy.g:980:1: ( ( '-' )? )
            {
            // InternalToy.g:980:1: ( ( '-' )? )
            // InternalToy.g:981:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalToy.g:982:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalToy.g:982:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalToy.g:990:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:994:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalToy.g:995:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalToy.g:1001:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1005:1: ( ( RULE_INT ) )
            // InternalToy.g:1006:1: ( RULE_INT )
            {
            // InternalToy.g:1006:1: ( RULE_INT )
            // InternalToy.g:1007:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalToy.g:1017:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1021:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalToy.g:1022:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalToy.g:1029:1: rule__Addition__Group__0__Impl : ( ( rule__Addition__Group_0__0 )? ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1033:1: ( ( ( rule__Addition__Group_0__0 )? ) )
            // InternalToy.g:1034:1: ( ( rule__Addition__Group_0__0 )? )
            {
            // InternalToy.g:1034:1: ( ( rule__Addition__Group_0__0 )? )
            // InternalToy.g:1035:2: ( rule__Addition__Group_0__0 )?
            {
             before(grammarAccess.getAdditionAccess().getGroup_0()); 
            // InternalToy.g:1036:2: ( rule__Addition__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalToy.g:1036:3: rule__Addition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdditionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalToy.g:1044:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1048:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalToy.g:1049:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Addition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalToy.g:1056:1: rule__Addition__Group__1__Impl : ( '(' ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1060:1: ( ( '(' ) )
            // InternalToy.g:1061:1: ( '(' )
            {
            // InternalToy.g:1061:1: ( '(' )
            // InternalToy.g:1062:2: '('
            {
             before(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__2"
    // InternalToy.g:1071:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl rule__Addition__Group__3 ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1075:1: ( rule__Addition__Group__2__Impl rule__Addition__Group__3 )
            // InternalToy.g:1076:2: rule__Addition__Group__2__Impl rule__Addition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2"


    // $ANTLR start "rule__Addition__Group__2__Impl"
    // InternalToy.g:1083:1: rule__Addition__Group__2__Impl : ( ( rule__Addition__LeftVariableAssignment_2 ) ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1087:1: ( ( ( rule__Addition__LeftVariableAssignment_2 ) ) )
            // InternalToy.g:1088:1: ( ( rule__Addition__LeftVariableAssignment_2 ) )
            {
            // InternalToy.g:1088:1: ( ( rule__Addition__LeftVariableAssignment_2 ) )
            // InternalToy.g:1089:2: ( rule__Addition__LeftVariableAssignment_2 )
            {
             before(grammarAccess.getAdditionAccess().getLeftVariableAssignment_2()); 
            // InternalToy.g:1090:2: ( rule__Addition__LeftVariableAssignment_2 )
            // InternalToy.g:1090:3: rule__Addition__LeftVariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__LeftVariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getLeftVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__3"
    // InternalToy.g:1098:1: rule__Addition__Group__3 : rule__Addition__Group__3__Impl rule__Addition__Group__4 ;
    public final void rule__Addition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1102:1: ( rule__Addition__Group__3__Impl rule__Addition__Group__4 )
            // InternalToy.g:1103:2: rule__Addition__Group__3__Impl rule__Addition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Addition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__3"


    // $ANTLR start "rule__Addition__Group__3__Impl"
    // InternalToy.g:1110:1: rule__Addition__Group__3__Impl : ( '+' ) ;
    public final void rule__Addition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1114:1: ( ( '+' ) )
            // InternalToy.g:1115:1: ( '+' )
            {
            // InternalToy.g:1115:1: ( '+' )
            // InternalToy.g:1116:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__4"
    // InternalToy.g:1125:1: rule__Addition__Group__4 : rule__Addition__Group__4__Impl rule__Addition__Group__5 ;
    public final void rule__Addition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1129:1: ( rule__Addition__Group__4__Impl rule__Addition__Group__5 )
            // InternalToy.g:1130:2: rule__Addition__Group__4__Impl rule__Addition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Addition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__4"


    // $ANTLR start "rule__Addition__Group__4__Impl"
    // InternalToy.g:1137:1: rule__Addition__Group__4__Impl : ( ( rule__Addition__RightVariableAssignment_4 ) ) ;
    public final void rule__Addition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1141:1: ( ( ( rule__Addition__RightVariableAssignment_4 ) ) )
            // InternalToy.g:1142:1: ( ( rule__Addition__RightVariableAssignment_4 ) )
            {
            // InternalToy.g:1142:1: ( ( rule__Addition__RightVariableAssignment_4 ) )
            // InternalToy.g:1143:2: ( rule__Addition__RightVariableAssignment_4 )
            {
             before(grammarAccess.getAdditionAccess().getRightVariableAssignment_4()); 
            // InternalToy.g:1144:2: ( rule__Addition__RightVariableAssignment_4 )
            // InternalToy.g:1144:3: rule__Addition__RightVariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightVariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__5"
    // InternalToy.g:1152:1: rule__Addition__Group__5 : rule__Addition__Group__5__Impl ;
    public final void rule__Addition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1156:1: ( rule__Addition__Group__5__Impl )
            // InternalToy.g:1157:2: rule__Addition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__5"


    // $ANTLR start "rule__Addition__Group__5__Impl"
    // InternalToy.g:1163:1: rule__Addition__Group__5__Impl : ( ')' ) ;
    public final void rule__Addition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1167:1: ( ( ')' ) )
            // InternalToy.g:1168:1: ( ')' )
            {
            // InternalToy.g:1168:1: ( ')' )
            // InternalToy.g:1169:2: ')'
            {
             before(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__5__Impl"


    // $ANTLR start "rule__Addition__Group_0__0"
    // InternalToy.g:1179:1: rule__Addition__Group_0__0 : rule__Addition__Group_0__0__Impl rule__Addition__Group_0__1 ;
    public final void rule__Addition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1183:1: ( rule__Addition__Group_0__0__Impl rule__Addition__Group_0__1 )
            // InternalToy.g:1184:2: rule__Addition__Group_0__0__Impl rule__Addition__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Addition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_0__0"


    // $ANTLR start "rule__Addition__Group_0__0__Impl"
    // InternalToy.g:1191:1: rule__Addition__Group_0__0__Impl : ( ( rule__Addition__NameAssignment_0_0 ) ) ;
    public final void rule__Addition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1195:1: ( ( ( rule__Addition__NameAssignment_0_0 ) ) )
            // InternalToy.g:1196:1: ( ( rule__Addition__NameAssignment_0_0 ) )
            {
            // InternalToy.g:1196:1: ( ( rule__Addition__NameAssignment_0_0 ) )
            // InternalToy.g:1197:2: ( rule__Addition__NameAssignment_0_0 )
            {
             before(grammarAccess.getAdditionAccess().getNameAssignment_0_0()); 
            // InternalToy.g:1198:2: ( rule__Addition__NameAssignment_0_0 )
            // InternalToy.g:1198:3: rule__Addition__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_0__1"
    // InternalToy.g:1206:1: rule__Addition__Group_0__1 : rule__Addition__Group_0__1__Impl ;
    public final void rule__Addition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1210:1: ( rule__Addition__Group_0__1__Impl )
            // InternalToy.g:1211:2: rule__Addition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_0__1"


    // $ANTLR start "rule__Addition__Group_0__1__Impl"
    // InternalToy.g:1217:1: rule__Addition__Group_0__1__Impl : ( '->' ) ;
    public final void rule__Addition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1221:1: ( ( '->' ) )
            // InternalToy.g:1222:1: ( '->' )
            {
            // InternalToy.g:1222:1: ( '->' )
            // InternalToy.g:1223:2: '->'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_0__1__Impl"


    // $ANTLR start "rule__Soustraction__Group__0"
    // InternalToy.g:1233:1: rule__Soustraction__Group__0 : rule__Soustraction__Group__0__Impl rule__Soustraction__Group__1 ;
    public final void rule__Soustraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1237:1: ( rule__Soustraction__Group__0__Impl rule__Soustraction__Group__1 )
            // InternalToy.g:1238:2: rule__Soustraction__Group__0__Impl rule__Soustraction__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Soustraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__0"


    // $ANTLR start "rule__Soustraction__Group__0__Impl"
    // InternalToy.g:1245:1: rule__Soustraction__Group__0__Impl : ( ( rule__Soustraction__Group_0__0 )? ) ;
    public final void rule__Soustraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1249:1: ( ( ( rule__Soustraction__Group_0__0 )? ) )
            // InternalToy.g:1250:1: ( ( rule__Soustraction__Group_0__0 )? )
            {
            // InternalToy.g:1250:1: ( ( rule__Soustraction__Group_0__0 )? )
            // InternalToy.g:1251:2: ( rule__Soustraction__Group_0__0 )?
            {
             before(grammarAccess.getSoustractionAccess().getGroup_0()); 
            // InternalToy.g:1252:2: ( rule__Soustraction__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalToy.g:1252:3: rule__Soustraction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Soustraction__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoustractionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__0__Impl"


    // $ANTLR start "rule__Soustraction__Group__1"
    // InternalToy.g:1260:1: rule__Soustraction__Group__1 : rule__Soustraction__Group__1__Impl rule__Soustraction__Group__2 ;
    public final void rule__Soustraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1264:1: ( rule__Soustraction__Group__1__Impl rule__Soustraction__Group__2 )
            // InternalToy.g:1265:2: rule__Soustraction__Group__1__Impl rule__Soustraction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Soustraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__1"


    // $ANTLR start "rule__Soustraction__Group__1__Impl"
    // InternalToy.g:1272:1: rule__Soustraction__Group__1__Impl : ( '(' ) ;
    public final void rule__Soustraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1276:1: ( ( '(' ) )
            // InternalToy.g:1277:1: ( '(' )
            {
            // InternalToy.g:1277:1: ( '(' )
            // InternalToy.g:1278:2: '('
            {
             before(grammarAccess.getSoustractionAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSoustractionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__1__Impl"


    // $ANTLR start "rule__Soustraction__Group__2"
    // InternalToy.g:1287:1: rule__Soustraction__Group__2 : rule__Soustraction__Group__2__Impl rule__Soustraction__Group__3 ;
    public final void rule__Soustraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1291:1: ( rule__Soustraction__Group__2__Impl rule__Soustraction__Group__3 )
            // InternalToy.g:1292:2: rule__Soustraction__Group__2__Impl rule__Soustraction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Soustraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__2"


    // $ANTLR start "rule__Soustraction__Group__2__Impl"
    // InternalToy.g:1299:1: rule__Soustraction__Group__2__Impl : ( ( rule__Soustraction__LeftVariableAssignment_2 ) ) ;
    public final void rule__Soustraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1303:1: ( ( ( rule__Soustraction__LeftVariableAssignment_2 ) ) )
            // InternalToy.g:1304:1: ( ( rule__Soustraction__LeftVariableAssignment_2 ) )
            {
            // InternalToy.g:1304:1: ( ( rule__Soustraction__LeftVariableAssignment_2 ) )
            // InternalToy.g:1305:2: ( rule__Soustraction__LeftVariableAssignment_2 )
            {
             before(grammarAccess.getSoustractionAccess().getLeftVariableAssignment_2()); 
            // InternalToy.g:1306:2: ( rule__Soustraction__LeftVariableAssignment_2 )
            // InternalToy.g:1306:3: rule__Soustraction__LeftVariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__LeftVariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoustractionAccess().getLeftVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__2__Impl"


    // $ANTLR start "rule__Soustraction__Group__3"
    // InternalToy.g:1314:1: rule__Soustraction__Group__3 : rule__Soustraction__Group__3__Impl rule__Soustraction__Group__4 ;
    public final void rule__Soustraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1318:1: ( rule__Soustraction__Group__3__Impl rule__Soustraction__Group__4 )
            // InternalToy.g:1319:2: rule__Soustraction__Group__3__Impl rule__Soustraction__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Soustraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__3"


    // $ANTLR start "rule__Soustraction__Group__3__Impl"
    // InternalToy.g:1326:1: rule__Soustraction__Group__3__Impl : ( '-' ) ;
    public final void rule__Soustraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1330:1: ( ( '-' ) )
            // InternalToy.g:1331:1: ( '-' )
            {
            // InternalToy.g:1331:1: ( '-' )
            // InternalToy.g:1332:2: '-'
            {
             before(grammarAccess.getSoustractionAccess().getHyphenMinusKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSoustractionAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__3__Impl"


    // $ANTLR start "rule__Soustraction__Group__4"
    // InternalToy.g:1341:1: rule__Soustraction__Group__4 : rule__Soustraction__Group__4__Impl rule__Soustraction__Group__5 ;
    public final void rule__Soustraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1345:1: ( rule__Soustraction__Group__4__Impl rule__Soustraction__Group__5 )
            // InternalToy.g:1346:2: rule__Soustraction__Group__4__Impl rule__Soustraction__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Soustraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__4"


    // $ANTLR start "rule__Soustraction__Group__4__Impl"
    // InternalToy.g:1353:1: rule__Soustraction__Group__4__Impl : ( ( rule__Soustraction__RightVariableAssignment_4 ) ) ;
    public final void rule__Soustraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1357:1: ( ( ( rule__Soustraction__RightVariableAssignment_4 ) ) )
            // InternalToy.g:1358:1: ( ( rule__Soustraction__RightVariableAssignment_4 ) )
            {
            // InternalToy.g:1358:1: ( ( rule__Soustraction__RightVariableAssignment_4 ) )
            // InternalToy.g:1359:2: ( rule__Soustraction__RightVariableAssignment_4 )
            {
             before(grammarAccess.getSoustractionAccess().getRightVariableAssignment_4()); 
            // InternalToy.g:1360:2: ( rule__Soustraction__RightVariableAssignment_4 )
            // InternalToy.g:1360:3: rule__Soustraction__RightVariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__RightVariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSoustractionAccess().getRightVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__4__Impl"


    // $ANTLR start "rule__Soustraction__Group__5"
    // InternalToy.g:1368:1: rule__Soustraction__Group__5 : rule__Soustraction__Group__5__Impl ;
    public final void rule__Soustraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1372:1: ( rule__Soustraction__Group__5__Impl )
            // InternalToy.g:1373:2: rule__Soustraction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__5"


    // $ANTLR start "rule__Soustraction__Group__5__Impl"
    // InternalToy.g:1379:1: rule__Soustraction__Group__5__Impl : ( ')' ) ;
    public final void rule__Soustraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1383:1: ( ( ')' ) )
            // InternalToy.g:1384:1: ( ')' )
            {
            // InternalToy.g:1384:1: ( ')' )
            // InternalToy.g:1385:2: ')'
            {
             before(grammarAccess.getSoustractionAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSoustractionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group__5__Impl"


    // $ANTLR start "rule__Soustraction__Group_0__0"
    // InternalToy.g:1395:1: rule__Soustraction__Group_0__0 : rule__Soustraction__Group_0__0__Impl rule__Soustraction__Group_0__1 ;
    public final void rule__Soustraction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1399:1: ( rule__Soustraction__Group_0__0__Impl rule__Soustraction__Group_0__1 )
            // InternalToy.g:1400:2: rule__Soustraction__Group_0__0__Impl rule__Soustraction__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Soustraction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Soustraction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group_0__0"


    // $ANTLR start "rule__Soustraction__Group_0__0__Impl"
    // InternalToy.g:1407:1: rule__Soustraction__Group_0__0__Impl : ( ( rule__Soustraction__NameAssignment_0_0 ) ) ;
    public final void rule__Soustraction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1411:1: ( ( ( rule__Soustraction__NameAssignment_0_0 ) ) )
            // InternalToy.g:1412:1: ( ( rule__Soustraction__NameAssignment_0_0 ) )
            {
            // InternalToy.g:1412:1: ( ( rule__Soustraction__NameAssignment_0_0 ) )
            // InternalToy.g:1413:2: ( rule__Soustraction__NameAssignment_0_0 )
            {
             before(grammarAccess.getSoustractionAccess().getNameAssignment_0_0()); 
            // InternalToy.g:1414:2: ( rule__Soustraction__NameAssignment_0_0 )
            // InternalToy.g:1414:3: rule__Soustraction__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSoustractionAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group_0__0__Impl"


    // $ANTLR start "rule__Soustraction__Group_0__1"
    // InternalToy.g:1422:1: rule__Soustraction__Group_0__1 : rule__Soustraction__Group_0__1__Impl ;
    public final void rule__Soustraction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1426:1: ( rule__Soustraction__Group_0__1__Impl )
            // InternalToy.g:1427:2: rule__Soustraction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Soustraction__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group_0__1"


    // $ANTLR start "rule__Soustraction__Group_0__1__Impl"
    // InternalToy.g:1433:1: rule__Soustraction__Group_0__1__Impl : ( '->' ) ;
    public final void rule__Soustraction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1437:1: ( ( '->' ) )
            // InternalToy.g:1438:1: ( '->' )
            {
            // InternalToy.g:1438:1: ( '->' )
            // InternalToy.g:1439:2: '->'
            {
             before(grammarAccess.getSoustractionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSoustractionAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalToy.g:1449:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1453:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalToy.g:1454:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalToy.g:1461:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Group_0__0 )? ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1465:1: ( ( ( rule__Assignment__Group_0__0 )? ) )
            // InternalToy.g:1466:1: ( ( rule__Assignment__Group_0__0 )? )
            {
            // InternalToy.g:1466:1: ( ( rule__Assignment__Group_0__0 )? )
            // InternalToy.g:1467:2: ( rule__Assignment__Group_0__0 )?
            {
             before(grammarAccess.getAssignmentAccess().getGroup_0()); 
            // InternalToy.g:1468:2: ( rule__Assignment__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==25) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalToy.g:1468:3: rule__Assignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalToy.g:1476:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1480:1: ( rule__Assignment__Group__1__Impl )
            // InternalToy.g:1481:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalToy.g:1487:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1491:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalToy.g:1492:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalToy.g:1492:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalToy.g:1493:2: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalToy.g:1494:2: ( rule__Assignment__Alternatives_1 )
            // InternalToy.g:1494:3: rule__Assignment__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__0"
    // InternalToy.g:1503:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1507:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // InternalToy.g:1508:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // InternalToy.g:1515:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__NameAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1519:1: ( ( ( rule__Assignment__NameAssignment_0_0 ) ) )
            // InternalToy.g:1520:1: ( ( rule__Assignment__NameAssignment_0_0 ) )
            {
            // InternalToy.g:1520:1: ( ( rule__Assignment__NameAssignment_0_0 ) )
            // InternalToy.g:1521:2: ( rule__Assignment__NameAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_0_0()); 
            // InternalToy.g:1522:2: ( rule__Assignment__NameAssignment_0_0 )
            // InternalToy.g:1522:3: rule__Assignment__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // InternalToy.g:1530:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1534:1: ( rule__Assignment__Group_0__1__Impl )
            // InternalToy.g:1535:2: rule__Assignment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // InternalToy.g:1541:1: rule__Assignment__Group_0__1__Impl : ( '->' ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1545:1: ( ( '->' ) )
            // InternalToy.g:1546:1: ( '->' )
            {
            // InternalToy.g:1546:1: ( '->' )
            // InternalToy.g:1547:2: '->'
            {
             before(grammarAccess.getAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__0"
    // InternalToy.g:1557:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1561:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // InternalToy.g:1562:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Assignment__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0"


    // $ANTLR start "rule__Assignment__Group_1_0__0__Impl"
    // InternalToy.g:1569:1: rule__Assignment__Group_1_0__0__Impl : ( 'Assign' ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1573:1: ( ( 'Assign' ) )
            // InternalToy.g:1574:1: ( 'Assign' )
            {
            // InternalToy.g:1574:1: ( 'Assign' )
            // InternalToy.g:1575:2: 'Assign'
            {
             before(grammarAccess.getAssignmentAccess().getAssignKeyword_1_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getAssignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__1"
    // InternalToy.g:1584:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl rule__Assignment__Group_1_0__2 ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1588:1: ( rule__Assignment__Group_1_0__1__Impl rule__Assignment__Group_1_0__2 )
            // InternalToy.g:1589:2: rule__Assignment__Group_1_0__1__Impl rule__Assignment__Group_1_0__2
            {
            pushFollow(FOLLOW_23);
            rule__Assignment__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1"


    // $ANTLR start "rule__Assignment__Group_1_0__1__Impl"
    // InternalToy.g:1596:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__VariableAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1600:1: ( ( ( rule__Assignment__VariableAssignment_1_0_1 ) ) )
            // InternalToy.g:1601:1: ( ( rule__Assignment__VariableAssignment_1_0_1 ) )
            {
            // InternalToy.g:1601:1: ( ( rule__Assignment__VariableAssignment_1_0_1 ) )
            // InternalToy.g:1602:2: ( rule__Assignment__VariableAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_1_0_1()); 
            // InternalToy.g:1603:2: ( rule__Assignment__VariableAssignment_1_0_1 )
            // InternalToy.g:1603:3: rule__Assignment__VariableAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VariableAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__2"
    // InternalToy.g:1611:1: rule__Assignment__Group_1_0__2 : rule__Assignment__Group_1_0__2__Impl rule__Assignment__Group_1_0__3 ;
    public final void rule__Assignment__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1615:1: ( rule__Assignment__Group_1_0__2__Impl rule__Assignment__Group_1_0__3 )
            // InternalToy.g:1616:2: rule__Assignment__Group_1_0__2__Impl rule__Assignment__Group_1_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__2"


    // $ANTLR start "rule__Assignment__Group_1_0__2__Impl"
    // InternalToy.g:1623:1: rule__Assignment__Group_1_0__2__Impl : ( 'with' ) ;
    public final void rule__Assignment__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1627:1: ( ( 'with' ) )
            // InternalToy.g:1628:1: ( 'with' )
            {
            // InternalToy.g:1628:1: ( 'with' )
            // InternalToy.g:1629:2: 'with'
            {
             before(grammarAccess.getAssignmentAccess().getWithKeyword_1_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getWithKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__2__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__3"
    // InternalToy.g:1638:1: rule__Assignment__Group_1_0__3 : rule__Assignment__Group_1_0__3__Impl ;
    public final void rule__Assignment__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1642:1: ( rule__Assignment__Group_1_0__3__Impl )
            // InternalToy.g:1643:2: rule__Assignment__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__3"


    // $ANTLR start "rule__Assignment__Group_1_0__3__Impl"
    // InternalToy.g:1649:1: rule__Assignment__Group_1_0__3__Impl : ( ( rule__Assignment__OperationAssignment_1_0_3 ) ) ;
    public final void rule__Assignment__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1653:1: ( ( ( rule__Assignment__OperationAssignment_1_0_3 ) ) )
            // InternalToy.g:1654:1: ( ( rule__Assignment__OperationAssignment_1_0_3 ) )
            {
            // InternalToy.g:1654:1: ( ( rule__Assignment__OperationAssignment_1_0_3 ) )
            // InternalToy.g:1655:2: ( rule__Assignment__OperationAssignment_1_0_3 )
            {
             before(grammarAccess.getAssignmentAccess().getOperationAssignment_1_0_3()); 
            // InternalToy.g:1656:2: ( rule__Assignment__OperationAssignment_1_0_3 )
            // InternalToy.g:1656:3: rule__Assignment__OperationAssignment_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__OperationAssignment_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperationAssignment_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__3__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1__0"
    // InternalToy.g:1665:1: rule__Assignment__Group_1_1__0 : rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1 ;
    public final void rule__Assignment__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1669:1: ( rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1 )
            // InternalToy.g:1670:2: rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Assignment__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__0"


    // $ANTLR start "rule__Assignment__Group_1_1__0__Impl"
    // InternalToy.g:1677:1: rule__Assignment__Group_1_1__0__Impl : ( ( rule__Assignment__VariableAssignment_1_1_0 ) ) ;
    public final void rule__Assignment__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1681:1: ( ( ( rule__Assignment__VariableAssignment_1_1_0 ) ) )
            // InternalToy.g:1682:1: ( ( rule__Assignment__VariableAssignment_1_1_0 ) )
            {
            // InternalToy.g:1682:1: ( ( rule__Assignment__VariableAssignment_1_1_0 ) )
            // InternalToy.g:1683:2: ( rule__Assignment__VariableAssignment_1_1_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_1_1_0()); 
            // InternalToy.g:1684:2: ( rule__Assignment__VariableAssignment_1_1_0 )
            // InternalToy.g:1684:3: rule__Assignment__VariableAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VariableAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1__1"
    // InternalToy.g:1692:1: rule__Assignment__Group_1_1__1 : rule__Assignment__Group_1_1__1__Impl rule__Assignment__Group_1_1__2 ;
    public final void rule__Assignment__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1696:1: ( rule__Assignment__Group_1_1__1__Impl rule__Assignment__Group_1_1__2 )
            // InternalToy.g:1697:2: rule__Assignment__Group_1_1__1__Impl rule__Assignment__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__1"


    // $ANTLR start "rule__Assignment__Group_1_1__1__Impl"
    // InternalToy.g:1704:1: rule__Assignment__Group_1_1__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1708:1: ( ( ':=' ) )
            // InternalToy.g:1709:1: ( ':=' )
            {
            // InternalToy.g:1709:1: ( ':=' )
            // InternalToy.g:1710:2: ':='
            {
             before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1__2"
    // InternalToy.g:1719:1: rule__Assignment__Group_1_1__2 : rule__Assignment__Group_1_1__2__Impl ;
    public final void rule__Assignment__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1723:1: ( rule__Assignment__Group_1_1__2__Impl )
            // InternalToy.g:1724:2: rule__Assignment__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__2"


    // $ANTLR start "rule__Assignment__Group_1_1__2__Impl"
    // InternalToy.g:1730:1: rule__Assignment__Group_1_1__2__Impl : ( ( rule__Assignment__OperationAssignment_1_1_2 ) ) ;
    public final void rule__Assignment__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1734:1: ( ( ( rule__Assignment__OperationAssignment_1_1_2 ) ) )
            // InternalToy.g:1735:1: ( ( rule__Assignment__OperationAssignment_1_1_2 ) )
            {
            // InternalToy.g:1735:1: ( ( rule__Assignment__OperationAssignment_1_1_2 ) )
            // InternalToy.g:1736:2: ( rule__Assignment__OperationAssignment_1_1_2 )
            {
             before(grammarAccess.getAssignmentAccess().getOperationAssignment_1_1_2()); 
            // InternalToy.g:1737:2: ( rule__Assignment__OperationAssignment_1_1_2 )
            // InternalToy.g:1737:3: rule__Assignment__OperationAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__OperationAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperationAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__2__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group__0"
    // InternalToy.g:1746:1: rule__ParallelAssignment__Group__0 : rule__ParallelAssignment__Group__0__Impl rule__ParallelAssignment__Group__1 ;
    public final void rule__ParallelAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1750:1: ( rule__ParallelAssignment__Group__0__Impl rule__ParallelAssignment__Group__1 )
            // InternalToy.g:1751:2: rule__ParallelAssignment__Group__0__Impl rule__ParallelAssignment__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ParallelAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group__0"


    // $ANTLR start "rule__ParallelAssignment__Group__0__Impl"
    // InternalToy.g:1758:1: rule__ParallelAssignment__Group__0__Impl : ( ( rule__ParallelAssignment__Group_0__0 )? ) ;
    public final void rule__ParallelAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1762:1: ( ( ( rule__ParallelAssignment__Group_0__0 )? ) )
            // InternalToy.g:1763:1: ( ( rule__ParallelAssignment__Group_0__0 )? )
            {
            // InternalToy.g:1763:1: ( ( rule__ParallelAssignment__Group_0__0 )? )
            // InternalToy.g:1764:2: ( rule__ParallelAssignment__Group_0__0 )?
            {
             before(grammarAccess.getParallelAssignmentAccess().getGroup_0()); 
            // InternalToy.g:1765:2: ( rule__ParallelAssignment__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalToy.g:1765:3: rule__ParallelAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParallelAssignment__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParallelAssignmentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group__0__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group__1"
    // InternalToy.g:1773:1: rule__ParallelAssignment__Group__1 : rule__ParallelAssignment__Group__1__Impl ;
    public final void rule__ParallelAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1777:1: ( rule__ParallelAssignment__Group__1__Impl )
            // InternalToy.g:1778:2: rule__ParallelAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group__1"


    // $ANTLR start "rule__ParallelAssignment__Group__1__Impl"
    // InternalToy.g:1784:1: rule__ParallelAssignment__Group__1__Impl : ( ( rule__ParallelAssignment__Group_1__0 ) ) ;
    public final void rule__ParallelAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1788:1: ( ( ( rule__ParallelAssignment__Group_1__0 ) ) )
            // InternalToy.g:1789:1: ( ( rule__ParallelAssignment__Group_1__0 ) )
            {
            // InternalToy.g:1789:1: ( ( rule__ParallelAssignment__Group_1__0 ) )
            // InternalToy.g:1790:2: ( rule__ParallelAssignment__Group_1__0 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getGroup_1()); 
            // InternalToy.g:1791:2: ( rule__ParallelAssignment__Group_1__0 )
            // InternalToy.g:1791:3: rule__ParallelAssignment__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group__1__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_0__0"
    // InternalToy.g:1800:1: rule__ParallelAssignment__Group_0__0 : rule__ParallelAssignment__Group_0__0__Impl rule__ParallelAssignment__Group_0__1 ;
    public final void rule__ParallelAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1804:1: ( rule__ParallelAssignment__Group_0__0__Impl rule__ParallelAssignment__Group_0__1 )
            // InternalToy.g:1805:2: rule__ParallelAssignment__Group_0__0__Impl rule__ParallelAssignment__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ParallelAssignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_0__0"


    // $ANTLR start "rule__ParallelAssignment__Group_0__0__Impl"
    // InternalToy.g:1812:1: rule__ParallelAssignment__Group_0__0__Impl : ( ( rule__ParallelAssignment__NameAssignment_0_0 ) ) ;
    public final void rule__ParallelAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1816:1: ( ( ( rule__ParallelAssignment__NameAssignment_0_0 ) ) )
            // InternalToy.g:1817:1: ( ( rule__ParallelAssignment__NameAssignment_0_0 ) )
            {
            // InternalToy.g:1817:1: ( ( rule__ParallelAssignment__NameAssignment_0_0 ) )
            // InternalToy.g:1818:2: ( rule__ParallelAssignment__NameAssignment_0_0 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getNameAssignment_0_0()); 
            // InternalToy.g:1819:2: ( rule__ParallelAssignment__NameAssignment_0_0 )
            // InternalToy.g:1819:3: rule__ParallelAssignment__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_0__0__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_0__1"
    // InternalToy.g:1827:1: rule__ParallelAssignment__Group_0__1 : rule__ParallelAssignment__Group_0__1__Impl ;
    public final void rule__ParallelAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1831:1: ( rule__ParallelAssignment__Group_0__1__Impl )
            // InternalToy.g:1832:2: rule__ParallelAssignment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_0__1"


    // $ANTLR start "rule__ParallelAssignment__Group_0__1__Impl"
    // InternalToy.g:1838:1: rule__ParallelAssignment__Group_0__1__Impl : ( '->' ) ;
    public final void rule__ParallelAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1842:1: ( ( '->' ) )
            // InternalToy.g:1843:1: ( '->' )
            {
            // InternalToy.g:1843:1: ( '->' )
            // InternalToy.g:1844:2: '->'
            {
             before(grammarAccess.getParallelAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParallelAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_0__1__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1__0"
    // InternalToy.g:1854:1: rule__ParallelAssignment__Group_1__0 : rule__ParallelAssignment__Group_1__0__Impl rule__ParallelAssignment__Group_1__1 ;
    public final void rule__ParallelAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1858:1: ( rule__ParallelAssignment__Group_1__0__Impl rule__ParallelAssignment__Group_1__1 )
            // InternalToy.g:1859:2: rule__ParallelAssignment__Group_1__0__Impl rule__ParallelAssignment__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ParallelAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__0"


    // $ANTLR start "rule__ParallelAssignment__Group_1__0__Impl"
    // InternalToy.g:1866:1: rule__ParallelAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ParallelAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1870:1: ( ( '[' ) )
            // InternalToy.g:1871:1: ( '[' )
            {
            // InternalToy.g:1871:1: ( '[' )
            // InternalToy.g:1872:2: '['
            {
             before(grammarAccess.getParallelAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParallelAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1__1"
    // InternalToy.g:1881:1: rule__ParallelAssignment__Group_1__1 : rule__ParallelAssignment__Group_1__1__Impl rule__ParallelAssignment__Group_1__2 ;
    public final void rule__ParallelAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1885:1: ( rule__ParallelAssignment__Group_1__1__Impl rule__ParallelAssignment__Group_1__2 )
            // InternalToy.g:1886:2: rule__ParallelAssignment__Group_1__1__Impl rule__ParallelAssignment__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__ParallelAssignment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__1"


    // $ANTLR start "rule__ParallelAssignment__Group_1__1__Impl"
    // InternalToy.g:1893:1: rule__ParallelAssignment__Group_1__1__Impl : ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 ) ) ;
    public final void rule__ParallelAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1897:1: ( ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 ) ) )
            // InternalToy.g:1898:1: ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 ) )
            {
            // InternalToy.g:1898:1: ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 ) )
            // InternalToy.g:1899:2: ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_1()); 
            // InternalToy.g:1900:2: ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 )
            // InternalToy.g:1900:3: rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1__2"
    // InternalToy.g:1908:1: rule__ParallelAssignment__Group_1__2 : rule__ParallelAssignment__Group_1__2__Impl rule__ParallelAssignment__Group_1__3 ;
    public final void rule__ParallelAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1912:1: ( rule__ParallelAssignment__Group_1__2__Impl rule__ParallelAssignment__Group_1__3 )
            // InternalToy.g:1913:2: rule__ParallelAssignment__Group_1__2__Impl rule__ParallelAssignment__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__ParallelAssignment__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__2"


    // $ANTLR start "rule__ParallelAssignment__Group_1__2__Impl"
    // InternalToy.g:1920:1: rule__ParallelAssignment__Group_1__2__Impl : ( ( ( rule__ParallelAssignment__Group_1_2__0 ) ) ( ( rule__ParallelAssignment__Group_1_2__0 )* ) ) ;
    public final void rule__ParallelAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1924:1: ( ( ( ( rule__ParallelAssignment__Group_1_2__0 ) ) ( ( rule__ParallelAssignment__Group_1_2__0 )* ) ) )
            // InternalToy.g:1925:1: ( ( ( rule__ParallelAssignment__Group_1_2__0 ) ) ( ( rule__ParallelAssignment__Group_1_2__0 )* ) )
            {
            // InternalToy.g:1925:1: ( ( ( rule__ParallelAssignment__Group_1_2__0 ) ) ( ( rule__ParallelAssignment__Group_1_2__0 )* ) )
            // InternalToy.g:1926:2: ( ( rule__ParallelAssignment__Group_1_2__0 ) ) ( ( rule__ParallelAssignment__Group_1_2__0 )* )
            {
            // InternalToy.g:1926:2: ( ( rule__ParallelAssignment__Group_1_2__0 ) )
            // InternalToy.g:1927:3: ( rule__ParallelAssignment__Group_1_2__0 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getGroup_1_2()); 
            // InternalToy.g:1928:3: ( rule__ParallelAssignment__Group_1_2__0 )
            // InternalToy.g:1928:4: rule__ParallelAssignment__Group_1_2__0
            {
            pushFollow(FOLLOW_28);
            rule__ParallelAssignment__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getGroup_1_2()); 

            }

            // InternalToy.g:1931:2: ( ( rule__ParallelAssignment__Group_1_2__0 )* )
            // InternalToy.g:1932:3: ( rule__ParallelAssignment__Group_1_2__0 )*
            {
             before(grammarAccess.getParallelAssignmentAccess().getGroup_1_2()); 
            // InternalToy.g:1933:3: ( rule__ParallelAssignment__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalToy.g:1933:4: rule__ParallelAssignment__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ParallelAssignment__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getParallelAssignmentAccess().getGroup_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1__3"
    // InternalToy.g:1942:1: rule__ParallelAssignment__Group_1__3 : rule__ParallelAssignment__Group_1__3__Impl ;
    public final void rule__ParallelAssignment__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1946:1: ( rule__ParallelAssignment__Group_1__3__Impl )
            // InternalToy.g:1947:2: rule__ParallelAssignment__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__3"


    // $ANTLR start "rule__ParallelAssignment__Group_1__3__Impl"
    // InternalToy.g:1953:1: rule__ParallelAssignment__Group_1__3__Impl : ( ']' ) ;
    public final void rule__ParallelAssignment__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1957:1: ( ( ']' ) )
            // InternalToy.g:1958:1: ( ']' )
            {
            // InternalToy.g:1958:1: ( ']' )
            // InternalToy.g:1959:2: ']'
            {
             before(grammarAccess.getParallelAssignmentAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParallelAssignmentAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1__3__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1_2__0"
    // InternalToy.g:1969:1: rule__ParallelAssignment__Group_1_2__0 : rule__ParallelAssignment__Group_1_2__0__Impl rule__ParallelAssignment__Group_1_2__1 ;
    public final void rule__ParallelAssignment__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1973:1: ( rule__ParallelAssignment__Group_1_2__0__Impl rule__ParallelAssignment__Group_1_2__1 )
            // InternalToy.g:1974:2: rule__ParallelAssignment__Group_1_2__0__Impl rule__ParallelAssignment__Group_1_2__1
            {
            pushFollow(FOLLOW_22);
            rule__ParallelAssignment__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1_2__0"


    // $ANTLR start "rule__ParallelAssignment__Group_1_2__0__Impl"
    // InternalToy.g:1981:1: rule__ParallelAssignment__Group_1_2__0__Impl : ( '|' ) ;
    public final void rule__ParallelAssignment__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:1985:1: ( ( '|' ) )
            // InternalToy.g:1986:1: ( '|' )
            {
            // InternalToy.g:1986:1: ( '|' )
            // InternalToy.g:1987:2: '|'
            {
             before(grammarAccess.getParallelAssignmentAccess().getVerticalLineKeyword_1_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParallelAssignmentAccess().getVerticalLineKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParallelAssignment__Group_1_2__1"
    // InternalToy.g:1996:1: rule__ParallelAssignment__Group_1_2__1 : rule__ParallelAssignment__Group_1_2__1__Impl ;
    public final void rule__ParallelAssignment__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2000:1: ( rule__ParallelAssignment__Group_1_2__1__Impl )
            // InternalToy.g:2001:2: rule__ParallelAssignment__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1_2__1"


    // $ANTLR start "rule__ParallelAssignment__Group_1_2__1__Impl"
    // InternalToy.g:2007:1: rule__ParallelAssignment__Group_1_2__1__Impl : ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 ) ) ;
    public final void rule__ParallelAssignment__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2011:1: ( ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 ) ) )
            // InternalToy.g:2012:1: ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 ) )
            {
            // InternalToy.g:2012:1: ( ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 ) )
            // InternalToy.g:2013:2: ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 )
            {
             before(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_2_1()); 
            // InternalToy.g:2014:2: ( rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 )
            // InternalToy.g:2014:3: rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__Group_1_2__1__Impl"


    // $ANTLR start "rule__ToyProgram__NameAssignment_2"
    // InternalToy.g:2023:1: rule__ToyProgram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ToyProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2027:1: ( ( ruleEString ) )
            // InternalToy.g:2028:2: ( ruleEString )
            {
            // InternalToy.g:2028:2: ( ruleEString )
            // InternalToy.g:2029:3: ruleEString
            {
             before(grammarAccess.getToyProgramAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getToyProgramAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__NameAssignment_2"


    // $ANTLR start "rule__ToyProgram__OwnedVariablesAssignment_3"
    // InternalToy.g:2038:1: rule__ToyProgram__OwnedVariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__ToyProgram__OwnedVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2042:1: ( ( ruleVariable ) )
            // InternalToy.g:2043:2: ( ruleVariable )
            {
            // InternalToy.g:2043:2: ( ruleVariable )
            // InternalToy.g:2044:3: ruleVariable
            {
             before(grammarAccess.getToyProgramAccess().getOwnedVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getToyProgramAccess().getOwnedVariablesVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__OwnedVariablesAssignment_3"


    // $ANTLR start "rule__ToyProgram__OwnedStatementsAssignment_4"
    // InternalToy.g:2053:1: rule__ToyProgram__OwnedStatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ToyProgram__OwnedStatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2057:1: ( ( ruleStatement ) )
            // InternalToy.g:2058:2: ( ruleStatement )
            {
            // InternalToy.g:2058:2: ( ruleStatement )
            // InternalToy.g:2059:3: ruleStatement
            {
             before(grammarAccess.getToyProgramAccess().getOwnedStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getToyProgramAccess().getOwnedStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToyProgram__OwnedStatementsAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalToy.g:2068:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2072:1: ( ( ruleEString ) )
            // InternalToy.g:2073:2: ( ruleEString )
            {
            // InternalToy.g:2073:2: ( ruleEString )
            // InternalToy.g:2074:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Variable__TypeAssignment_4"
    // InternalToy.g:2083:1: rule__Variable__TypeAssignment_4 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2087:1: ( ( ruleVarType ) )
            // InternalToy.g:2088:2: ( ruleVarType )
            {
            // InternalToy.g:2088:2: ( ruleVarType )
            // InternalToy.g:2089:3: ruleVarType
            {
             before(grammarAccess.getVariableAccess().getTypeVarTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeVarTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_4"


    // $ANTLR start "rule__Variable__InitialValueAssignment_6"
    // InternalToy.g:2098:1: rule__Variable__InitialValueAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Variable__InitialValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2102:1: ( ( ruleEDouble ) )
            // InternalToy.g:2103:2: ( ruleEDouble )
            {
            // InternalToy.g:2103:2: ( ruleEDouble )
            // InternalToy.g:2104:3: ruleEDouble
            {
             before(grammarAccess.getVariableAccess().getInitialValueEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getInitialValueEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__InitialValueAssignment_6"


    // $ANTLR start "rule__Addition__NameAssignment_0_0"
    // InternalToy.g:2113:1: rule__Addition__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Addition__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2117:1: ( ( RULE_ID ) )
            // InternalToy.g:2118:2: ( RULE_ID )
            {
            // InternalToy.g:2118:2: ( RULE_ID )
            // InternalToy.g:2119:3: RULE_ID
            {
             before(grammarAccess.getAdditionAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__NameAssignment_0_0"


    // $ANTLR start "rule__Addition__LeftVariableAssignment_2"
    // InternalToy.g:2128:1: rule__Addition__LeftVariableAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Addition__LeftVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2132:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2133:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2133:2: ( ( ruleEString ) )
            // InternalToy.g:2134:3: ( ruleEString )
            {
             before(grammarAccess.getAdditionAccess().getLeftVariableVariableCrossReference_2_0()); 
            // InternalToy.g:2135:3: ( ruleEString )
            // InternalToy.g:2136:4: ruleEString
            {
             before(grammarAccess.getAdditionAccess().getLeftVariableVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getLeftVariableVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAdditionAccess().getLeftVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__LeftVariableAssignment_2"


    // $ANTLR start "rule__Addition__RightVariableAssignment_4"
    // InternalToy.g:2147:1: rule__Addition__RightVariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Addition__RightVariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2151:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2152:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2152:2: ( ( ruleEString ) )
            // InternalToy.g:2153:3: ( ruleEString )
            {
             before(grammarAccess.getAdditionAccess().getRightVariableVariableCrossReference_4_0()); 
            // InternalToy.g:2154:3: ( ruleEString )
            // InternalToy.g:2155:4: ruleEString
            {
             before(grammarAccess.getAdditionAccess().getRightVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightVariableVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAdditionAccess().getRightVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightVariableAssignment_4"


    // $ANTLR start "rule__Soustraction__NameAssignment_0_0"
    // InternalToy.g:2166:1: rule__Soustraction__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Soustraction__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2170:1: ( ( RULE_ID ) )
            // InternalToy.g:2171:2: ( RULE_ID )
            {
            // InternalToy.g:2171:2: ( RULE_ID )
            // InternalToy.g:2172:3: RULE_ID
            {
             before(grammarAccess.getSoustractionAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSoustractionAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__NameAssignment_0_0"


    // $ANTLR start "rule__Soustraction__LeftVariableAssignment_2"
    // InternalToy.g:2181:1: rule__Soustraction__LeftVariableAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Soustraction__LeftVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2185:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2186:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2186:2: ( ( ruleEString ) )
            // InternalToy.g:2187:3: ( ruleEString )
            {
             before(grammarAccess.getSoustractionAccess().getLeftVariableVariableCrossReference_2_0()); 
            // InternalToy.g:2188:3: ( ruleEString )
            // InternalToy.g:2189:4: ruleEString
            {
             before(grammarAccess.getSoustractionAccess().getLeftVariableVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoustractionAccess().getLeftVariableVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSoustractionAccess().getLeftVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__LeftVariableAssignment_2"


    // $ANTLR start "rule__Soustraction__RightVariableAssignment_4"
    // InternalToy.g:2200:1: rule__Soustraction__RightVariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Soustraction__RightVariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2204:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2205:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2205:2: ( ( ruleEString ) )
            // InternalToy.g:2206:3: ( ruleEString )
            {
             before(grammarAccess.getSoustractionAccess().getRightVariableVariableCrossReference_4_0()); 
            // InternalToy.g:2207:3: ( ruleEString )
            // InternalToy.g:2208:4: ruleEString
            {
             before(grammarAccess.getSoustractionAccess().getRightVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoustractionAccess().getRightVariableVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSoustractionAccess().getRightVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Soustraction__RightVariableAssignment_4"


    // $ANTLR start "rule__Assignment__NameAssignment_0_0"
    // InternalToy.g:2219:1: rule__Assignment__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2223:1: ( ( RULE_ID ) )
            // InternalToy.g:2224:2: ( RULE_ID )
            {
            // InternalToy.g:2224:2: ( RULE_ID )
            // InternalToy.g:2225:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__NameAssignment_0_0"


    // $ANTLR start "rule__Assignment__VariableAssignment_1_0_1"
    // InternalToy.g:2234:1: rule__Assignment__VariableAssignment_1_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__VariableAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2238:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2239:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2239:2: ( ( ruleEString ) )
            // InternalToy.g:2240:3: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_0_1_0()); 
            // InternalToy.g:2241:3: ( ruleEString )
            // InternalToy.g:2242:4: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_1_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_1_0_1"


    // $ANTLR start "rule__Assignment__OperationAssignment_1_0_3"
    // InternalToy.g:2253:1: rule__Assignment__OperationAssignment_1_0_3 : ( ruleOperation ) ;
    public final void rule__Assignment__OperationAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2257:1: ( ( ruleOperation ) )
            // InternalToy.g:2258:2: ( ruleOperation )
            {
            // InternalToy.g:2258:2: ( ruleOperation )
            // InternalToy.g:2259:3: ruleOperation
            {
             before(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperationAssignment_1_0_3"


    // $ANTLR start "rule__Assignment__VariableAssignment_1_1_0"
    // InternalToy.g:2268:1: rule__Assignment__VariableAssignment_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__VariableAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2272:1: ( ( ( ruleEString ) ) )
            // InternalToy.g:2273:2: ( ( ruleEString ) )
            {
            // InternalToy.g:2273:2: ( ( ruleEString ) )
            // InternalToy.g:2274:3: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_1_0_0()); 
            // InternalToy.g:2275:3: ( ruleEString )
            // InternalToy.g:2276:4: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getVariableVariableEStringParserRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_1_1_0"


    // $ANTLR start "rule__Assignment__OperationAssignment_1_1_2"
    // InternalToy.g:2287:1: rule__Assignment__OperationAssignment_1_1_2 : ( ruleOperation ) ;
    public final void rule__Assignment__OperationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2291:1: ( ( ruleOperation ) )
            // InternalToy.g:2292:2: ( ruleOperation )
            {
            // InternalToy.g:2292:2: ( ruleOperation )
            // InternalToy.g:2293:3: ruleOperation
            {
             before(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getOperationOperationParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperationAssignment_1_1_2"


    // $ANTLR start "rule__ParallelAssignment__NameAssignment_0_0"
    // InternalToy.g:2302:1: rule__ParallelAssignment__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ParallelAssignment__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2306:1: ( ( RULE_ID ) )
            // InternalToy.g:2307:2: ( RULE_ID )
            {
            // InternalToy.g:2307:2: ( RULE_ID )
            // InternalToy.g:2308:3: RULE_ID
            {
             before(grammarAccess.getParallelAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParallelAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__NameAssignment_0_0"


    // $ANTLR start "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1"
    // InternalToy.g:2317:1: rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2321:1: ( ( ruleAssignment ) )
            // InternalToy.g:2322:2: ( ruleAssignment )
            {
            // InternalToy.g:2322:2: ( ruleAssignment )
            // InternalToy.g:2323:3: ruleAssignment
            {
             before(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1"


    // $ANTLR start "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1"
    // InternalToy.g:2332:1: rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1 : ( ruleAssignment ) ;
    public final void rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalToy.g:2336:1: ( ( ruleAssignment ) )
            // InternalToy.g:2337:2: ( ruleAssignment )
            {
            // InternalToy.g:2337:2: ( ruleAssignment )
            // InternalToy.g:2338:3: ruleAssignment
            {
             before(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000024410030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000024400032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000024400030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});

}