package dk.sdu.mmmi.mdsd.ui23.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.ui23.services.Ui23GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUi23Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'function'", "'('", "')'", "':'", "','", "'form'", "'{'", "'}'", "'label'", "'input'", "'button'", "'*'", "'boolean'", "'string'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&'", "'+'", "'-'", "'/'", "'row'", "'column'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUi23Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUi23Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUi23Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalUi23.g"; }


    	private Ui23GrammarAccess grammarAccess;

    	public void setGrammarAccess(Ui23GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUI"
    // InternalUi23.g:53:1: entryRuleUI : ruleUI EOF ;
    public final void entryRuleUI() throws RecognitionException {
        try {
            // InternalUi23.g:54:1: ( ruleUI EOF )
            // InternalUi23.g:55:1: ruleUI EOF
            {
             before(grammarAccess.getUIRule()); 
            pushFollow(FOLLOW_1);
            ruleUI();

            state._fsp--;

             after(grammarAccess.getUIRule()); 
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
    // $ANTLR end "entryRuleUI"


    // $ANTLR start "ruleUI"
    // InternalUi23.g:62:1: ruleUI : ( ( rule__UI__Group__0 ) ) ;
    public final void ruleUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:66:2: ( ( ( rule__UI__Group__0 ) ) )
            // InternalUi23.g:67:2: ( ( rule__UI__Group__0 ) )
            {
            // InternalUi23.g:67:2: ( ( rule__UI__Group__0 ) )
            // InternalUi23.g:68:3: ( rule__UI__Group__0 )
            {
             before(grammarAccess.getUIAccess().getGroup()); 
            // InternalUi23.g:69:3: ( rule__UI__Group__0 )
            // InternalUi23.g:69:4: rule__UI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIAccess().getGroup()); 

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
    // $ANTLR end "ruleUI"


    // $ANTLR start "entryRuleFunction"
    // InternalUi23.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalUi23.g:79:1: ( ruleFunction EOF )
            // InternalUi23.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalUi23.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalUi23.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalUi23.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalUi23.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalUi23.g:94:3: ( rule__Function__Group__0 )
            // InternalUi23.g:94:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleForm"
    // InternalUi23.g:103:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalUi23.g:104:1: ( ruleForm EOF )
            // InternalUi23.g:105:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalUi23.g:112:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:116:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalUi23.g:117:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalUi23.g:117:2: ( ( rule__Form__Group__0 ) )
            // InternalUi23.g:118:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalUi23.g:119:3: ( rule__Form__Group__0 )
            // InternalUi23.g:119:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalUi23.g:128:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalUi23.g:129:1: ( ruleLayout EOF )
            // InternalUi23.g:130:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalUi23.g:137:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:141:2: ( ( ( rule__Layout__Group__0 ) ) )
            // InternalUi23.g:142:2: ( ( rule__Layout__Group__0 ) )
            {
            // InternalUi23.g:142:2: ( ( rule__Layout__Group__0 ) )
            // InternalUi23.g:143:3: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // InternalUi23.g:144:3: ( rule__Layout__Group__0 )
            // InternalUi23.g:144:4: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleComponent"
    // InternalUi23.g:153:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalUi23.g:154:1: ( ruleComponent EOF )
            // InternalUi23.g:155:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalUi23.g:162:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:166:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalUi23.g:167:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalUi23.g:167:2: ( ( rule__Component__Alternatives ) )
            // InternalUi23.g:168:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalUi23.g:169:3: ( rule__Component__Alternatives )
            // InternalUi23.g:169:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleElement"
    // InternalUi23.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalUi23.g:179:1: ( ruleElement EOF )
            // InternalUi23.g:180:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUi23.g:187:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:191:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalUi23.g:192:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalUi23.g:192:2: ( ( rule__Element__Alternatives ) )
            // InternalUi23.g:193:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalUi23.g:194:3: ( rule__Element__Alternatives )
            // InternalUi23.g:194:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalUi23.g:203:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalUi23.g:204:1: ( ruleLabel EOF )
            // InternalUi23.g:205:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalUi23.g:212:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:216:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalUi23.g:217:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalUi23.g:217:2: ( ( rule__Label__Group__0 ) )
            // InternalUi23.g:218:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalUi23.g:219:3: ( rule__Label__Group__0 )
            // InternalUi23.g:219:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInputText"
    // InternalUi23.g:228:1: entryRuleInputText : ruleInputText EOF ;
    public final void entryRuleInputText() throws RecognitionException {
        try {
            // InternalUi23.g:229:1: ( ruleInputText EOF )
            // InternalUi23.g:230:1: ruleInputText EOF
            {
             before(grammarAccess.getInputTextRule()); 
            pushFollow(FOLLOW_1);
            ruleInputText();

            state._fsp--;

             after(grammarAccess.getInputTextRule()); 
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
    // $ANTLR end "entryRuleInputText"


    // $ANTLR start "ruleInputText"
    // InternalUi23.g:237:1: ruleInputText : ( ( rule__InputText__Group__0 ) ) ;
    public final void ruleInputText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:241:2: ( ( ( rule__InputText__Group__0 ) ) )
            // InternalUi23.g:242:2: ( ( rule__InputText__Group__0 ) )
            {
            // InternalUi23.g:242:2: ( ( rule__InputText__Group__0 ) )
            // InternalUi23.g:243:3: ( rule__InputText__Group__0 )
            {
             before(grammarAccess.getInputTextAccess().getGroup()); 
            // InternalUi23.g:244:3: ( rule__InputText__Group__0 )
            // InternalUi23.g:244:4: rule__InputText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getGroup()); 

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
    // $ANTLR end "ruleInputText"


    // $ANTLR start "entryRuleButton"
    // InternalUi23.g:253:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalUi23.g:254:1: ( ruleButton EOF )
            // InternalUi23.g:255:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUi23.g:262:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:266:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalUi23.g:267:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalUi23.g:267:2: ( ( rule__Button__Group__0 ) )
            // InternalUi23.g:268:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalUi23.g:269:3: ( rule__Button__Group__0 )
            // InternalUi23.g:269:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleFormUse"
    // InternalUi23.g:278:1: entryRuleFormUse : ruleFormUse EOF ;
    public final void entryRuleFormUse() throws RecognitionException {
        try {
            // InternalUi23.g:279:1: ( ruleFormUse EOF )
            // InternalUi23.g:280:1: ruleFormUse EOF
            {
             before(grammarAccess.getFormUseRule()); 
            pushFollow(FOLLOW_1);
            ruleFormUse();

            state._fsp--;

             after(grammarAccess.getFormUseRule()); 
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
    // $ANTLR end "entryRuleFormUse"


    // $ANTLR start "ruleFormUse"
    // InternalUi23.g:287:1: ruleFormUse : ( ( rule__FormUse__Group__0 ) ) ;
    public final void ruleFormUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:291:2: ( ( ( rule__FormUse__Group__0 ) ) )
            // InternalUi23.g:292:2: ( ( rule__FormUse__Group__0 ) )
            {
            // InternalUi23.g:292:2: ( ( rule__FormUse__Group__0 ) )
            // InternalUi23.g:293:3: ( rule__FormUse__Group__0 )
            {
             before(grammarAccess.getFormUseAccess().getGroup()); 
            // InternalUi23.g:294:3: ( rule__FormUse__Group__0 )
            // InternalUi23.g:294:4: rule__FormUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getGroup()); 

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
    // $ANTLR end "ruleFormUse"


    // $ANTLR start "entryRuleParameter"
    // InternalUi23.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUi23.g:304:1: ( ruleParameter EOF )
            // InternalUi23.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUi23.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUi23.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUi23.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUi23.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUi23.g:319:3: ( rule__Parameter__Group__0 )
            // InternalUi23.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalUi23.g:328:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUi23.g:329:1: ( ruleType EOF )
            // InternalUi23.g:330:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUi23.g:337:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:341:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUi23.g:342:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUi23.g:342:2: ( ( rule__Type__Alternatives ) )
            // InternalUi23.g:343:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUi23.g:344:3: ( rule__Type__Alternatives )
            // InternalUi23.g:344:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalUi23.g:353:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalUi23.g:354:1: ( ruleExp EOF )
            // InternalUi23.g:355:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalUi23.g:362:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:366:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalUi23.g:367:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalUi23.g:367:2: ( ( rule__Exp__Group__0 ) )
            // InternalUi23.g:368:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalUi23.g:369:3: ( rule__Exp__Group__0 )
            // InternalUi23.g:369:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleEquality"
    // InternalUi23.g:378:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalUi23.g:379:1: ( ruleEquality EOF )
            // InternalUi23.g:380:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalUi23.g:387:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:391:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalUi23.g:392:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalUi23.g:392:2: ( ( rule__Equality__Group__0 ) )
            // InternalUi23.g:393:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalUi23.g:394:3: ( rule__Equality__Group__0 )
            // InternalUi23.g:394:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleCompare"
    // InternalUi23.g:403:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalUi23.g:404:1: ( ruleCompare EOF )
            // InternalUi23.g:405:1: ruleCompare EOF
            {
             before(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getCompareRule()); 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalUi23.g:412:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:416:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalUi23.g:417:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalUi23.g:417:2: ( ( rule__Compare__Group__0 ) )
            // InternalUi23.g:418:3: ( rule__Compare__Group__0 )
            {
             before(grammarAccess.getCompareAccess().getGroup()); 
            // InternalUi23.g:419:3: ( rule__Compare__Group__0 )
            // InternalUi23.g:419:4: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getGroup()); 

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleConcat"
    // InternalUi23.g:428:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // InternalUi23.g:429:1: ( ruleConcat EOF )
            // InternalUi23.g:430:1: ruleConcat EOF
            {
             before(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getConcatRule()); 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalUi23.g:437:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:441:2: ( ( ( rule__Concat__Group__0 ) ) )
            // InternalUi23.g:442:2: ( ( rule__Concat__Group__0 ) )
            {
            // InternalUi23.g:442:2: ( ( rule__Concat__Group__0 ) )
            // InternalUi23.g:443:3: ( rule__Concat__Group__0 )
            {
             before(grammarAccess.getConcatAccess().getGroup()); 
            // InternalUi23.g:444:3: ( rule__Concat__Group__0 )
            // InternalUi23.g:444:4: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getGroup()); 

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleAddMinus"
    // InternalUi23.g:453:1: entryRuleAddMinus : ruleAddMinus EOF ;
    public final void entryRuleAddMinus() throws RecognitionException {
        try {
            // InternalUi23.g:454:1: ( ruleAddMinus EOF )
            // InternalUi23.g:455:1: ruleAddMinus EOF
            {
             before(grammarAccess.getAddMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleAddMinus();

            state._fsp--;

             after(grammarAccess.getAddMinusRule()); 
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
    // $ANTLR end "entryRuleAddMinus"


    // $ANTLR start "ruleAddMinus"
    // InternalUi23.g:462:1: ruleAddMinus : ( ( rule__AddMinus__Group__0 ) ) ;
    public final void ruleAddMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:466:2: ( ( ( rule__AddMinus__Group__0 ) ) )
            // InternalUi23.g:467:2: ( ( rule__AddMinus__Group__0 ) )
            {
            // InternalUi23.g:467:2: ( ( rule__AddMinus__Group__0 ) )
            // InternalUi23.g:468:3: ( rule__AddMinus__Group__0 )
            {
             before(grammarAccess.getAddMinusAccess().getGroup()); 
            // InternalUi23.g:469:3: ( rule__AddMinus__Group__0 )
            // InternalUi23.g:469:4: rule__AddMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddMinusAccess().getGroup()); 

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
    // $ANTLR end "ruleAddMinus"


    // $ANTLR start "entryRuleFactor"
    // InternalUi23.g:478:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalUi23.g:479:1: ( ruleFactor EOF )
            // InternalUi23.g:480:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalUi23.g:487:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:491:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalUi23.g:492:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalUi23.g:492:2: ( ( rule__Factor__Group__0 ) )
            // InternalUi23.g:493:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalUi23.g:494:3: ( rule__Factor__Group__0 )
            // InternalUi23.g:494:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalUi23.g:503:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalUi23.g:504:1: ( rulePrimary EOF )
            // InternalUi23.g:505:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalUi23.g:512:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:516:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalUi23.g:517:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalUi23.g:517:2: ( ( rule__Primary__Alternatives ) )
            // InternalUi23.g:518:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalUi23.g:519:3: ( rule__Primary__Alternatives )
            // InternalUi23.g:519:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__Layout__Alternatives_0"
    // InternalUi23.g:527:1: rule__Layout__Alternatives_0 : ( ( ( rule__Layout__NameAssignment_0_0 ) ) | ( ( rule__Layout__NameAssignment_0_1 ) ) );
    public final void rule__Layout__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:531:1: ( ( ( rule__Layout__NameAssignment_0_0 ) ) | ( ( rule__Layout__NameAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==39) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUi23.g:532:2: ( ( rule__Layout__NameAssignment_0_0 ) )
                    {
                    // InternalUi23.g:532:2: ( ( rule__Layout__NameAssignment_0_0 ) )
                    // InternalUi23.g:533:3: ( rule__Layout__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getLayoutAccess().getNameAssignment_0_0()); 
                    // InternalUi23.g:534:3: ( rule__Layout__NameAssignment_0_0 )
                    // InternalUi23.g:534:4: rule__Layout__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layout__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:538:2: ( ( rule__Layout__NameAssignment_0_1 ) )
                    {
                    // InternalUi23.g:538:2: ( ( rule__Layout__NameAssignment_0_1 ) )
                    // InternalUi23.g:539:3: ( rule__Layout__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getLayoutAccess().getNameAssignment_0_1()); 
                    // InternalUi23.g:540:3: ( rule__Layout__NameAssignment_0_1 )
                    // InternalUi23.g:540:4: rule__Layout__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Layout__NameAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Layout__Alternatives_0"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalUi23.g:548:1: rule__Component__Alternatives : ( ( ruleLayout ) | ( ruleElement ) | ( ruleFormUse ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:552:1: ( ( ruleLayout ) | ( ruleElement ) | ( ruleFormUse ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt2=1;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUi23.g:553:2: ( ruleLayout )
                    {
                    // InternalUi23.g:553:2: ( ruleLayout )
                    // InternalUi23.g:554:3: ruleLayout
                    {
                     before(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayout();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:559:2: ( ruleElement )
                    {
                    // InternalUi23.g:559:2: ( ruleElement )
                    // InternalUi23.g:560:3: ruleElement
                    {
                     before(grammarAccess.getComponentAccess().getElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:565:2: ( ruleFormUse )
                    {
                    // InternalUi23.g:565:2: ( ruleFormUse )
                    // InternalUi23.g:566:3: ruleFormUse
                    {
                     before(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFormUse();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalUi23.g:575:1: rule__Element__Alternatives : ( ( ruleLabel ) | ( ruleInputText ) | ( ruleButton ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:579:1: ( ( ruleLabel ) | ( ruleInputText ) | ( ruleButton ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
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
                    // InternalUi23.g:580:2: ( ruleLabel )
                    {
                    // InternalUi23.g:580:2: ( ruleLabel )
                    // InternalUi23.g:581:3: ruleLabel
                    {
                     before(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:586:2: ( ruleInputText )
                    {
                    // InternalUi23.g:586:2: ( ruleInputText )
                    // InternalUi23.g:587:3: ruleInputText
                    {
                     before(grammarAccess.getElementAccess().getInputTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInputText();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInputTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:592:2: ( ruleButton )
                    {
                    // InternalUi23.g:592:2: ( ruleButton )
                    // InternalUi23.g:593:3: ruleButton
                    {
                     before(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUi23.g:602:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:606:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUi23.g:607:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalUi23.g:607:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalUi23.g:608:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalUi23.g:609:3: ( rule__Type__Group_0__0 )
                    // InternalUi23.g:609:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:613:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalUi23.g:613:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalUi23.g:614:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalUi23.g:615:3: ( rule__Type__Group_1__0 )
                    // InternalUi23.g:615:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:619:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalUi23.g:619:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalUi23.g:620:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalUi23.g:621:3: ( rule__Type__Group_2__0 )
                    // InternalUi23.g:621:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalUi23.g:629:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:633:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUi23.g:634:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalUi23.g:634:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalUi23.g:635:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalUi23.g:636:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalUi23.g:636:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:640:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalUi23.g:640:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalUi23.g:641:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalUi23.g:642:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalUi23.g:642:4: rule__Exp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalUi23.g:650:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:654:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUi23.g:655:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalUi23.g:655:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalUi23.g:656:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    // InternalUi23.g:657:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalUi23.g:657:4: rule__Equality__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:661:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalUi23.g:661:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalUi23.g:662:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    // InternalUi23.g:663:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalUi23.g:663:4: rule__Equality__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Equality__Alternatives_1_0"


    // $ANTLR start "rule__Compare__Alternatives_1_0"
    // InternalUi23.g:671:1: rule__Compare__Alternatives_1_0 : ( ( ( rule__Compare__Group_1_0_0__0 ) ) | ( ( rule__Compare__Group_1_0_1__0 ) ) | ( ( rule__Compare__Group_1_0_2__0 ) ) | ( ( rule__Compare__Group_1_0_3__0 ) ) );
    public final void rule__Compare__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:675:1: ( ( ( rule__Compare__Group_1_0_0__0 ) ) | ( ( rule__Compare__Group_1_0_1__0 ) ) | ( ( rule__Compare__Group_1_0_2__0 ) ) | ( ( rule__Compare__Group_1_0_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUi23.g:676:2: ( ( rule__Compare__Group_1_0_0__0 ) )
                    {
                    // InternalUi23.g:676:2: ( ( rule__Compare__Group_1_0_0__0 ) )
                    // InternalUi23.g:677:3: ( rule__Compare__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_0_0()); 
                    // InternalUi23.g:678:3: ( rule__Compare__Group_1_0_0__0 )
                    // InternalUi23.g:678:4: rule__Compare__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:682:2: ( ( rule__Compare__Group_1_0_1__0 ) )
                    {
                    // InternalUi23.g:682:2: ( ( rule__Compare__Group_1_0_1__0 ) )
                    // InternalUi23.g:683:3: ( rule__Compare__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_0_1()); 
                    // InternalUi23.g:684:3: ( rule__Compare__Group_1_0_1__0 )
                    // InternalUi23.g:684:4: rule__Compare__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:688:2: ( ( rule__Compare__Group_1_0_2__0 ) )
                    {
                    // InternalUi23.g:688:2: ( ( rule__Compare__Group_1_0_2__0 ) )
                    // InternalUi23.g:689:3: ( rule__Compare__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_0_2()); 
                    // InternalUi23.g:690:3: ( rule__Compare__Group_1_0_2__0 )
                    // InternalUi23.g:690:4: rule__Compare__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUi23.g:694:2: ( ( rule__Compare__Group_1_0_3__0 ) )
                    {
                    // InternalUi23.g:694:2: ( ( rule__Compare__Group_1_0_3__0 ) )
                    // InternalUi23.g:695:3: ( rule__Compare__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_0_3()); 
                    // InternalUi23.g:696:3: ( rule__Compare__Group_1_0_3__0 )
                    // InternalUi23.g:696:4: rule__Compare__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_0_3()); 

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
    // $ANTLR end "rule__Compare__Alternatives_1_0"


    // $ANTLR start "rule__AddMinus__Alternatives_1_0"
    // InternalUi23.g:704:1: rule__AddMinus__Alternatives_1_0 : ( ( ( rule__AddMinus__Group_1_0_0__0 ) ) | ( ( rule__AddMinus__Group_1_0_1__0 ) ) );
    public final void rule__AddMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:708:1: ( ( ( rule__AddMinus__Group_1_0_0__0 ) ) | ( ( rule__AddMinus__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUi23.g:709:2: ( ( rule__AddMinus__Group_1_0_0__0 ) )
                    {
                    // InternalUi23.g:709:2: ( ( rule__AddMinus__Group_1_0_0__0 ) )
                    // InternalUi23.g:710:3: ( rule__AddMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddMinusAccess().getGroup_1_0_0()); 
                    // InternalUi23.g:711:3: ( rule__AddMinus__Group_1_0_0__0 )
                    // InternalUi23.g:711:4: rule__AddMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:715:2: ( ( rule__AddMinus__Group_1_0_1__0 ) )
                    {
                    // InternalUi23.g:715:2: ( ( rule__AddMinus__Group_1_0_1__0 ) )
                    // InternalUi23.g:716:3: ( rule__AddMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddMinusAccess().getGroup_1_0_1()); 
                    // InternalUi23.g:717:3: ( rule__AddMinus__Group_1_0_1__0 )
                    // InternalUi23.g:717:4: rule__AddMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__AddMinus__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives_1_0"
    // InternalUi23.g:725:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:729:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==38) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUi23.g:730:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalUi23.g:730:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalUi23.g:731:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalUi23.g:732:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalUi23.g:732:4: rule__Factor__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:736:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalUi23.g:736:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalUi23.g:737:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalUi23.g:738:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalUi23.g:738:4: rule__Factor__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Factor__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalUi23.g:746:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleType ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:750:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleType ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            case 24:
            case 25:
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUi23.g:751:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalUi23.g:751:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalUi23.g:752:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalUi23.g:753:3: ( rule__Primary__Group_0__0 )
                    // InternalUi23.g:753:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:757:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalUi23.g:757:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalUi23.g:758:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalUi23.g:759:3: ( rule__Primary__Group_1__0 )
                    // InternalUi23.g:759:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:763:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalUi23.g:763:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalUi23.g:764:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalUi23.g:765:3: ( rule__Primary__Group_2__0 )
                    // InternalUi23.g:765:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUi23.g:769:2: ( ruleType )
                    {
                    // InternalUi23.g:769:2: ( ruleType )
                    // InternalUi23.g:770:3: ruleType
                    {
                     before(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__UI__Group__0"
    // InternalUi23.g:779:1: rule__UI__Group__0 : rule__UI__Group__0__Impl rule__UI__Group__1 ;
    public final void rule__UI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:783:1: ( rule__UI__Group__0__Impl rule__UI__Group__1 )
            // InternalUi23.g:784:2: rule__UI__Group__0__Impl rule__UI__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI__Group__1();

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
    // $ANTLR end "rule__UI__Group__0"


    // $ANTLR start "rule__UI__Group__0__Impl"
    // InternalUi23.g:791:1: rule__UI__Group__0__Impl : ( 'title' ) ;
    public final void rule__UI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:795:1: ( ( 'title' ) )
            // InternalUi23.g:796:1: ( 'title' )
            {
            // InternalUi23.g:796:1: ( 'title' )
            // InternalUi23.g:797:2: 'title'
            {
             before(grammarAccess.getUIAccess().getTitleKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUIAccess().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__UI__Group__0__Impl"


    // $ANTLR start "rule__UI__Group__1"
    // InternalUi23.g:806:1: rule__UI__Group__1 : rule__UI__Group__1__Impl rule__UI__Group__2 ;
    public final void rule__UI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:810:1: ( rule__UI__Group__1__Impl rule__UI__Group__2 )
            // InternalUi23.g:811:2: rule__UI__Group__1__Impl rule__UI__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI__Group__2();

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
    // $ANTLR end "rule__UI__Group__1"


    // $ANTLR start "rule__UI__Group__1__Impl"
    // InternalUi23.g:818:1: rule__UI__Group__1__Impl : ( ( rule__UI__TitleAssignment_1 ) ) ;
    public final void rule__UI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:822:1: ( ( ( rule__UI__TitleAssignment_1 ) ) )
            // InternalUi23.g:823:1: ( ( rule__UI__TitleAssignment_1 ) )
            {
            // InternalUi23.g:823:1: ( ( rule__UI__TitleAssignment_1 ) )
            // InternalUi23.g:824:2: ( rule__UI__TitleAssignment_1 )
            {
             before(grammarAccess.getUIAccess().getTitleAssignment_1()); 
            // InternalUi23.g:825:2: ( rule__UI__TitleAssignment_1 )
            // InternalUi23.g:825:3: rule__UI__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UI__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__UI__Group__1__Impl"


    // $ANTLR start "rule__UI__Group__2"
    // InternalUi23.g:833:1: rule__UI__Group__2 : rule__UI__Group__2__Impl rule__UI__Group__3 ;
    public final void rule__UI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:837:1: ( rule__UI__Group__2__Impl rule__UI__Group__3 )
            // InternalUi23.g:838:2: rule__UI__Group__2__Impl rule__UI__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI__Group__3();

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
    // $ANTLR end "rule__UI__Group__2"


    // $ANTLR start "rule__UI__Group__2__Impl"
    // InternalUi23.g:845:1: rule__UI__Group__2__Impl : ( ( rule__UI__FunctionsAssignment_2 )* ) ;
    public final void rule__UI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:849:1: ( ( ( rule__UI__FunctionsAssignment_2 )* ) )
            // InternalUi23.g:850:1: ( ( rule__UI__FunctionsAssignment_2 )* )
            {
            // InternalUi23.g:850:1: ( ( rule__UI__FunctionsAssignment_2 )* )
            // InternalUi23.g:851:2: ( rule__UI__FunctionsAssignment_2 )*
            {
             before(grammarAccess.getUIAccess().getFunctionsAssignment_2()); 
            // InternalUi23.g:852:2: ( rule__UI__FunctionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUi23.g:852:3: rule__UI__FunctionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__UI__FunctionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUIAccess().getFunctionsAssignment_2()); 

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
    // $ANTLR end "rule__UI__Group__2__Impl"


    // $ANTLR start "rule__UI__Group__3"
    // InternalUi23.g:860:1: rule__UI__Group__3 : rule__UI__Group__3__Impl ;
    public final void rule__UI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:864:1: ( rule__UI__Group__3__Impl )
            // InternalUi23.g:865:2: rule__UI__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UI__Group__3__Impl();

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
    // $ANTLR end "rule__UI__Group__3"


    // $ANTLR start "rule__UI__Group__3__Impl"
    // InternalUi23.g:871:1: rule__UI__Group__3__Impl : ( ( rule__UI__FormsAssignment_3 )* ) ;
    public final void rule__UI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:875:1: ( ( ( rule__UI__FormsAssignment_3 )* ) )
            // InternalUi23.g:876:1: ( ( rule__UI__FormsAssignment_3 )* )
            {
            // InternalUi23.g:876:1: ( ( rule__UI__FormsAssignment_3 )* )
            // InternalUi23.g:877:2: ( rule__UI__FormsAssignment_3 )*
            {
             before(grammarAccess.getUIAccess().getFormsAssignment_3()); 
            // InternalUi23.g:878:2: ( rule__UI__FormsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUi23.g:878:3: rule__UI__FormsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UI__FormsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUIAccess().getFormsAssignment_3()); 

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
    // $ANTLR end "rule__UI__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalUi23.g:887:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:891:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalUi23.g:892:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalUi23.g:899:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:903:1: ( ( 'function' ) )
            // InternalUi23.g:904:1: ( 'function' )
            {
            // InternalUi23.g:904:1: ( 'function' )
            // InternalUi23.g:905:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalUi23.g:914:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:918:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalUi23.g:919:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalUi23.g:926:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:930:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalUi23.g:931:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalUi23.g:931:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalUi23.g:932:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalUi23.g:933:2: ( rule__Function__NameAssignment_1 )
            // InternalUi23.g:933:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalUi23.g:941:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:945:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalUi23.g:946:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalUi23.g:953:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:957:1: ( ( '(' ) )
            // InternalUi23.g:958:1: ( '(' )
            {
            // InternalUi23.g:958:1: ( '(' )
            // InternalUi23.g:959:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalUi23.g:968:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:972:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalUi23.g:973:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalUi23.g:980:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:984:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalUi23.g:985:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalUi23.g:985:1: ( ( rule__Function__Group_3__0 )? )
            // InternalUi23.g:986:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalUi23.g:987:2: ( rule__Function__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUi23.g:987:3: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalUi23.g:995:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:999:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalUi23.g:1000:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalUi23.g:1007:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1011:1: ( ( ')' ) )
            // InternalUi23.g:1012:1: ( ')' )
            {
            // InternalUi23.g:1012:1: ( ')' )
            // InternalUi23.g:1013:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalUi23.g:1022:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1026:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalUi23.g:1027:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalUi23.g:1034:1: rule__Function__Group__5__Impl : ( ':' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1038:1: ( ( ':' ) )
            // InternalUi23.g:1039:1: ( ':' )
            {
            // InternalUi23.g:1039:1: ( ':' )
            // InternalUi23.g:1040:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalUi23.g:1049:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1053:1: ( rule__Function__Group__6__Impl )
            // InternalUi23.g:1054:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__6__Impl();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalUi23.g:1060:1: rule__Function__Group__6__Impl : ( ( rule__Function__TypesAssignment_6 ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1064:1: ( ( ( rule__Function__TypesAssignment_6 ) ) )
            // InternalUi23.g:1065:1: ( ( rule__Function__TypesAssignment_6 ) )
            {
            // InternalUi23.g:1065:1: ( ( rule__Function__TypesAssignment_6 ) )
            // InternalUi23.g:1066:2: ( rule__Function__TypesAssignment_6 )
            {
             before(grammarAccess.getFunctionAccess().getTypesAssignment_6()); 
            // InternalUi23.g:1067:2: ( rule__Function__TypesAssignment_6 )
            // InternalUi23.g:1067:3: rule__Function__TypesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Function__TypesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getTypesAssignment_6()); 

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
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalUi23.g:1076:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1080:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalUi23.g:1081:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1();

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
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // InternalUi23.g:1088:1: rule__Function__Group_3__0__Impl : ( ( rule__Function__TypesAssignment_3_0 ) ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1092:1: ( ( ( rule__Function__TypesAssignment_3_0 ) ) )
            // InternalUi23.g:1093:1: ( ( rule__Function__TypesAssignment_3_0 ) )
            {
            // InternalUi23.g:1093:1: ( ( rule__Function__TypesAssignment_3_0 ) )
            // InternalUi23.g:1094:2: ( rule__Function__TypesAssignment_3_0 )
            {
             before(grammarAccess.getFunctionAccess().getTypesAssignment_3_0()); 
            // InternalUi23.g:1095:2: ( rule__Function__TypesAssignment_3_0 )
            // InternalUi23.g:1095:3: rule__Function__TypesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__TypesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getTypesAssignment_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // InternalUi23.g:1103:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1107:1: ( rule__Function__Group_3__1__Impl )
            // InternalUi23.g:1108:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // InternalUi23.g:1114:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__Group_3_1__0 )* ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1118:1: ( ( ( rule__Function__Group_3_1__0 )* ) )
            // InternalUi23.g:1119:1: ( ( rule__Function__Group_3_1__0 )* )
            {
            // InternalUi23.g:1119:1: ( ( rule__Function__Group_3_1__0 )* )
            // InternalUi23.g:1120:2: ( rule__Function__Group_3_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_1()); 
            // InternalUi23.g:1121:2: ( rule__Function__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUi23.g:1121:3: rule__Function__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Function__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_3_1__0"
    // InternalUi23.g:1130:1: rule__Function__Group_3_1__0 : rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 ;
    public final void rule__Function__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1134:1: ( rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 )
            // InternalUi23.g:1135:2: rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1();

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
    // $ANTLR end "rule__Function__Group_3_1__0"


    // $ANTLR start "rule__Function__Group_3_1__0__Impl"
    // InternalUi23.g:1142:1: rule__Function__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1146:1: ( ( ',' ) )
            // InternalUi23.g:1147:1: ( ',' )
            {
            // InternalUi23.g:1147:1: ( ',' )
            // InternalUi23.g:1148:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Function__Group_3_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1__1"
    // InternalUi23.g:1157:1: rule__Function__Group_3_1__1 : rule__Function__Group_3_1__1__Impl ;
    public final void rule__Function__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1161:1: ( rule__Function__Group_3_1__1__Impl )
            // InternalUi23.g:1162:2: rule__Function__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3_1__1"


    // $ANTLR start "rule__Function__Group_3_1__1__Impl"
    // InternalUi23.g:1168:1: rule__Function__Group_3_1__1__Impl : ( ( rule__Function__TypesAssignment_3_1_1 ) ) ;
    public final void rule__Function__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1172:1: ( ( ( rule__Function__TypesAssignment_3_1_1 ) ) )
            // InternalUi23.g:1173:1: ( ( rule__Function__TypesAssignment_3_1_1 ) )
            {
            // InternalUi23.g:1173:1: ( ( rule__Function__TypesAssignment_3_1_1 ) )
            // InternalUi23.g:1174:2: ( rule__Function__TypesAssignment_3_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1()); 
            // InternalUi23.g:1175:2: ( rule__Function__TypesAssignment_3_1_1 )
            // InternalUi23.g:1175:3: rule__Function__TypesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__TypesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Function__Group_3_1__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalUi23.g:1184:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1188:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalUi23.g:1189:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

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
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalUi23.g:1196:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1200:1: ( ( 'form' ) )
            // InternalUi23.g:1201:1: ( 'form' )
            {
            // InternalUi23.g:1201:1: ( 'form' )
            // InternalUi23.g:1202:2: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

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
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalUi23.g:1211:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1215:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalUi23.g:1216:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

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
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalUi23.g:1223:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1227:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalUi23.g:1228:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalUi23.g:1228:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalUi23.g:1229:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalUi23.g:1230:2: ( rule__Form__NameAssignment_1 )
            // InternalUi23.g:1230:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalUi23.g:1238:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1242:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalUi23.g:1243:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

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
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalUi23.g:1250:1: rule__Form__Group__2__Impl : ( ( rule__Form__Group_2__0 )? ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1254:1: ( ( ( rule__Form__Group_2__0 )? ) )
            // InternalUi23.g:1255:1: ( ( rule__Form__Group_2__0 )? )
            {
            // InternalUi23.g:1255:1: ( ( rule__Form__Group_2__0 )? )
            // InternalUi23.g:1256:2: ( rule__Form__Group_2__0 )?
            {
             before(grammarAccess.getFormAccess().getGroup_2()); 
            // InternalUi23.g:1257:2: ( rule__Form__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUi23.g:1257:3: rule__Form__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // InternalUi23.g:1265:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1269:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalUi23.g:1270:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

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
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalUi23.g:1277:1: rule__Form__Group__3__Impl : ( '{' ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1281:1: ( ( '{' ) )
            // InternalUi23.g:1282:1: ( '{' )
            {
            // InternalUi23.g:1282:1: ( '{' )
            // InternalUi23.g:1283:2: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalUi23.g:1292:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1296:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalUi23.g:1297:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Form__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__5();

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
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalUi23.g:1304:1: rule__Form__Group__4__Impl : ( ( rule__Form__LayoutAssignment_4 ) ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1308:1: ( ( ( rule__Form__LayoutAssignment_4 ) ) )
            // InternalUi23.g:1309:1: ( ( rule__Form__LayoutAssignment_4 ) )
            {
            // InternalUi23.g:1309:1: ( ( rule__Form__LayoutAssignment_4 ) )
            // InternalUi23.g:1310:2: ( rule__Form__LayoutAssignment_4 )
            {
             before(grammarAccess.getFormAccess().getLayoutAssignment_4()); 
            // InternalUi23.g:1311:2: ( rule__Form__LayoutAssignment_4 )
            // InternalUi23.g:1311:3: rule__Form__LayoutAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Form__LayoutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getLayoutAssignment_4()); 

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
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // InternalUi23.g:1319:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1323:1: ( rule__Form__Group__5__Impl )
            // InternalUi23.g:1324:2: rule__Form__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__5__Impl();

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
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // InternalUi23.g:1330:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1334:1: ( ( '}' ) )
            // InternalUi23.g:1335:1: ( '}' )
            {
            // InternalUi23.g:1335:1: ( '}' )
            // InternalUi23.g:1336:2: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__Form__Group_2__0"
    // InternalUi23.g:1346:1: rule__Form__Group_2__0 : rule__Form__Group_2__0__Impl rule__Form__Group_2__1 ;
    public final void rule__Form__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1350:1: ( rule__Form__Group_2__0__Impl rule__Form__Group_2__1 )
            // InternalUi23.g:1351:2: rule__Form__Group_2__0__Impl rule__Form__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Form__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2__1();

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
    // $ANTLR end "rule__Form__Group_2__0"


    // $ANTLR start "rule__Form__Group_2__0__Impl"
    // InternalUi23.g:1358:1: rule__Form__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1362:1: ( ( '(' ) )
            // InternalUi23.g:1363:1: ( '(' )
            {
            // InternalUi23.g:1363:1: ( '(' )
            // InternalUi23.g:1364:2: '('
            {
             before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Form__Group_2__0__Impl"


    // $ANTLR start "rule__Form__Group_2__1"
    // InternalUi23.g:1373:1: rule__Form__Group_2__1 : rule__Form__Group_2__1__Impl rule__Form__Group_2__2 ;
    public final void rule__Form__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1377:1: ( rule__Form__Group_2__1__Impl rule__Form__Group_2__2 )
            // InternalUi23.g:1378:2: rule__Form__Group_2__1__Impl rule__Form__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Form__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2__2();

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
    // $ANTLR end "rule__Form__Group_2__1"


    // $ANTLR start "rule__Form__Group_2__1__Impl"
    // InternalUi23.g:1385:1: rule__Form__Group_2__1__Impl : ( ( rule__Form__Group_2_1__0 )? ) ;
    public final void rule__Form__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1389:1: ( ( ( rule__Form__Group_2_1__0 )? ) )
            // InternalUi23.g:1390:1: ( ( rule__Form__Group_2_1__0 )? )
            {
            // InternalUi23.g:1390:1: ( ( rule__Form__Group_2_1__0 )? )
            // InternalUi23.g:1391:2: ( rule__Form__Group_2_1__0 )?
            {
             before(grammarAccess.getFormAccess().getGroup_2_1()); 
            // InternalUi23.g:1392:2: ( rule__Form__Group_2_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUi23.g:1392:3: rule__Form__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Form__Group_2__1__Impl"


    // $ANTLR start "rule__Form__Group_2__2"
    // InternalUi23.g:1400:1: rule__Form__Group_2__2 : rule__Form__Group_2__2__Impl ;
    public final void rule__Form__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1404:1: ( rule__Form__Group_2__2__Impl )
            // InternalUi23.g:1405:2: rule__Form__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2__2__Impl();

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
    // $ANTLR end "rule__Form__Group_2__2"


    // $ANTLR start "rule__Form__Group_2__2__Impl"
    // InternalUi23.g:1411:1: rule__Form__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1415:1: ( ( ')' ) )
            // InternalUi23.g:1416:1: ( ')' )
            {
            // InternalUi23.g:1416:1: ( ')' )
            // InternalUi23.g:1417:2: ')'
            {
             before(grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Form__Group_2__2__Impl"


    // $ANTLR start "rule__Form__Group_2_1__0"
    // InternalUi23.g:1427:1: rule__Form__Group_2_1__0 : rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1 ;
    public final void rule__Form__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1431:1: ( rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1 )
            // InternalUi23.g:1432:2: rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Form__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1__1();

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
    // $ANTLR end "rule__Form__Group_2_1__0"


    // $ANTLR start "rule__Form__Group_2_1__0__Impl"
    // InternalUi23.g:1439:1: rule__Form__Group_2_1__0__Impl : ( ( rule__Form__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Form__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1443:1: ( ( ( rule__Form__ParametersAssignment_2_1_0 ) ) )
            // InternalUi23.g:1444:1: ( ( rule__Form__ParametersAssignment_2_1_0 ) )
            {
            // InternalUi23.g:1444:1: ( ( rule__Form__ParametersAssignment_2_1_0 ) )
            // InternalUi23.g:1445:2: ( rule__Form__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getFormAccess().getParametersAssignment_2_1_0()); 
            // InternalUi23.g:1446:2: ( rule__Form__ParametersAssignment_2_1_0 )
            // InternalUi23.g:1446:3: rule__Form__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Form__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getParametersAssignment_2_1_0()); 

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
    // $ANTLR end "rule__Form__Group_2_1__0__Impl"


    // $ANTLR start "rule__Form__Group_2_1__1"
    // InternalUi23.g:1454:1: rule__Form__Group_2_1__1 : rule__Form__Group_2_1__1__Impl ;
    public final void rule__Form__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1458:1: ( rule__Form__Group_2_1__1__Impl )
            // InternalUi23.g:1459:2: rule__Form__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Form__Group_2_1__1"


    // $ANTLR start "rule__Form__Group_2_1__1__Impl"
    // InternalUi23.g:1465:1: rule__Form__Group_2_1__1__Impl : ( ( rule__Form__Group_2_1_1__0 )* ) ;
    public final void rule__Form__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1469:1: ( ( ( rule__Form__Group_2_1_1__0 )* ) )
            // InternalUi23.g:1470:1: ( ( rule__Form__Group_2_1_1__0 )* )
            {
            // InternalUi23.g:1470:1: ( ( rule__Form__Group_2_1_1__0 )* )
            // InternalUi23.g:1471:2: ( rule__Form__Group_2_1_1__0 )*
            {
             before(grammarAccess.getFormAccess().getGroup_2_1_1()); 
            // InternalUi23.g:1472:2: ( rule__Form__Group_2_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUi23.g:1472:3: rule__Form__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Form__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__Form__Group_2_1__1__Impl"


    // $ANTLR start "rule__Form__Group_2_1_1__0"
    // InternalUi23.g:1481:1: rule__Form__Group_2_1_1__0 : rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1 ;
    public final void rule__Form__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1485:1: ( rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1 )
            // InternalUi23.g:1486:2: rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1_1__1();

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
    // $ANTLR end "rule__Form__Group_2_1_1__0"


    // $ANTLR start "rule__Form__Group_2_1_1__0__Impl"
    // InternalUi23.g:1493:1: rule__Form__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Form__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1497:1: ( ( ',' ) )
            // InternalUi23.g:1498:1: ( ',' )
            {
            // InternalUi23.g:1498:1: ( ',' )
            // InternalUi23.g:1499:2: ','
            {
             before(grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__Form__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Form__Group_2_1_1__1"
    // InternalUi23.g:1508:1: rule__Form__Group_2_1_1__1 : rule__Form__Group_2_1_1__1__Impl ;
    public final void rule__Form__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1512:1: ( rule__Form__Group_2_1_1__1__Impl )
            // InternalUi23.g:1513:2: rule__Form__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Form__Group_2_1_1__1"


    // $ANTLR start "rule__Form__Group_2_1_1__1__Impl"
    // InternalUi23.g:1519:1: rule__Form__Group_2_1_1__1__Impl : ( ( rule__Form__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Form__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1523:1: ( ( ( rule__Form__ParametersAssignment_2_1_1_1 ) ) )
            // InternalUi23.g:1524:1: ( ( rule__Form__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalUi23.g:1524:1: ( ( rule__Form__ParametersAssignment_2_1_1_1 ) )
            // InternalUi23.g:1525:2: ( rule__Form__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1()); 
            // InternalUi23.g:1526:2: ( rule__Form__ParametersAssignment_2_1_1_1 )
            // InternalUi23.g:1526:3: rule__Form__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__Form__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // InternalUi23.g:1535:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1539:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // InternalUi23.g:1540:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__1();

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
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // InternalUi23.g:1547:1: rule__Layout__Group__0__Impl : ( ( rule__Layout__Alternatives_0 ) ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1551:1: ( ( ( rule__Layout__Alternatives_0 ) ) )
            // InternalUi23.g:1552:1: ( ( rule__Layout__Alternatives_0 ) )
            {
            // InternalUi23.g:1552:1: ( ( rule__Layout__Alternatives_0 ) )
            // InternalUi23.g:1553:2: ( rule__Layout__Alternatives_0 )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives_0()); 
            // InternalUi23.g:1554:2: ( rule__Layout__Alternatives_0 )
            // InternalUi23.g:1554:3: rule__Layout__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // InternalUi23.g:1562:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1566:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // InternalUi23.g:1567:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__2();

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
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // InternalUi23.g:1574:1: rule__Layout__Group__1__Impl : ( '{' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1578:1: ( ( '{' ) )
            // InternalUi23.g:1579:1: ( '{' )
            {
            // InternalUi23.g:1579:1: ( '{' )
            // InternalUi23.g:1580:2: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // InternalUi23.g:1589:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1593:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // InternalUi23.g:1594:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__3();

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
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // InternalUi23.g:1601:1: rule__Layout__Group__2__Impl : ( ( rule__Layout__ComponentsAssignment_2 )* ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1605:1: ( ( ( rule__Layout__ComponentsAssignment_2 )* ) )
            // InternalUi23.g:1606:1: ( ( rule__Layout__ComponentsAssignment_2 )* )
            {
            // InternalUi23.g:1606:1: ( ( rule__Layout__ComponentsAssignment_2 )* )
            // InternalUi23.g:1607:2: ( rule__Layout__ComponentsAssignment_2 )*
            {
             before(grammarAccess.getLayoutAccess().getComponentsAssignment_2()); 
            // InternalUi23.g:1608:2: ( rule__Layout__ComponentsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=20 && LA18_0<=22)||(LA18_0>=39 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUi23.g:1608:3: rule__Layout__ComponentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Layout__ComponentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getComponentsAssignment_2()); 

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
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // InternalUi23.g:1616:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1620:1: ( rule__Layout__Group__3__Impl )
            // InternalUi23.g:1621:2: rule__Layout__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__3__Impl();

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
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // InternalUi23.g:1627:1: rule__Layout__Group__3__Impl : ( '}' ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1631:1: ( ( '}' ) )
            // InternalUi23.g:1632:1: ( '}' )
            {
            // InternalUi23.g:1632:1: ( '}' )
            // InternalUi23.g:1633:2: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalUi23.g:1643:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1647:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalUi23.g:1648:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalUi23.g:1655:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1659:1: ( ( 'label' ) )
            // InternalUi23.g:1660:1: ( 'label' )
            {
            // InternalUi23.g:1660:1: ( 'label' )
            // InternalUi23.g:1661:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalUi23.g:1670:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1674:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalUi23.g:1675:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalUi23.g:1682:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1686:1: ( ( ':' ) )
            // InternalUi23.g:1687:1: ( ':' )
            {
            // InternalUi23.g:1687:1: ( ':' )
            // InternalUi23.g:1688:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalUi23.g:1697:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1701:1: ( rule__Label__Group__2__Impl )
            // InternalUi23.g:1702:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

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
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalUi23.g:1708:1: rule__Label__Group__2__Impl : ( ( rule__Label__ExpressionAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1712:1: ( ( ( rule__Label__ExpressionAssignment_2 ) ) )
            // InternalUi23.g:1713:1: ( ( rule__Label__ExpressionAssignment_2 ) )
            {
            // InternalUi23.g:1713:1: ( ( rule__Label__ExpressionAssignment_2 ) )
            // InternalUi23.g:1714:2: ( rule__Label__ExpressionAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getExpressionAssignment_2()); 
            // InternalUi23.g:1715:2: ( rule__Label__ExpressionAssignment_2 )
            // InternalUi23.g:1715:3: rule__Label__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__InputText__Group__0"
    // InternalUi23.g:1724:1: rule__InputText__Group__0 : rule__InputText__Group__0__Impl rule__InputText__Group__1 ;
    public final void rule__InputText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1728:1: ( rule__InputText__Group__0__Impl rule__InputText__Group__1 )
            // InternalUi23.g:1729:2: rule__InputText__Group__0__Impl rule__InputText__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__1();

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
    // $ANTLR end "rule__InputText__Group__0"


    // $ANTLR start "rule__InputText__Group__0__Impl"
    // InternalUi23.g:1736:1: rule__InputText__Group__0__Impl : ( 'input' ) ;
    public final void rule__InputText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1740:1: ( ( 'input' ) )
            // InternalUi23.g:1741:1: ( 'input' )
            {
            // InternalUi23.g:1741:1: ( 'input' )
            // InternalUi23.g:1742:2: 'input'
            {
             before(grammarAccess.getInputTextAccess().getInputKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getInputKeyword_0()); 

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
    // $ANTLR end "rule__InputText__Group__0__Impl"


    // $ANTLR start "rule__InputText__Group__1"
    // InternalUi23.g:1751:1: rule__InputText__Group__1 : rule__InputText__Group__1__Impl rule__InputText__Group__2 ;
    public final void rule__InputText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1755:1: ( rule__InputText__Group__1__Impl rule__InputText__Group__2 )
            // InternalUi23.g:1756:2: rule__InputText__Group__1__Impl rule__InputText__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__InputText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__2();

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
    // $ANTLR end "rule__InputText__Group__1"


    // $ANTLR start "rule__InputText__Group__1__Impl"
    // InternalUi23.g:1763:1: rule__InputText__Group__1__Impl : ( ( rule__InputText__NameAssignment_1 ) ) ;
    public final void rule__InputText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1767:1: ( ( ( rule__InputText__NameAssignment_1 ) ) )
            // InternalUi23.g:1768:1: ( ( rule__InputText__NameAssignment_1 ) )
            {
            // InternalUi23.g:1768:1: ( ( rule__InputText__NameAssignment_1 ) )
            // InternalUi23.g:1769:2: ( rule__InputText__NameAssignment_1 )
            {
             before(grammarAccess.getInputTextAccess().getNameAssignment_1()); 
            // InternalUi23.g:1770:2: ( rule__InputText__NameAssignment_1 )
            // InternalUi23.g:1770:3: rule__InputText__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputText__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InputText__Group__1__Impl"


    // $ANTLR start "rule__InputText__Group__2"
    // InternalUi23.g:1778:1: rule__InputText__Group__2 : rule__InputText__Group__2__Impl rule__InputText__Group__3 ;
    public final void rule__InputText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1782:1: ( rule__InputText__Group__2__Impl rule__InputText__Group__3 )
            // InternalUi23.g:1783:2: rule__InputText__Group__2__Impl rule__InputText__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__InputText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__3();

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
    // $ANTLR end "rule__InputText__Group__2"


    // $ANTLR start "rule__InputText__Group__2__Impl"
    // InternalUi23.g:1790:1: rule__InputText__Group__2__Impl : ( ':' ) ;
    public final void rule__InputText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1794:1: ( ( ':' ) )
            // InternalUi23.g:1795:1: ( ':' )
            {
            // InternalUi23.g:1795:1: ( ':' )
            // InternalUi23.g:1796:2: ':'
            {
             before(grammarAccess.getInputTextAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__InputText__Group__2__Impl"


    // $ANTLR start "rule__InputText__Group__3"
    // InternalUi23.g:1805:1: rule__InputText__Group__3 : rule__InputText__Group__3__Impl ;
    public final void rule__InputText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1809:1: ( rule__InputText__Group__3__Impl )
            // InternalUi23.g:1810:2: rule__InputText__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputText__Group__3__Impl();

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
    // $ANTLR end "rule__InputText__Group__3"


    // $ANTLR start "rule__InputText__Group__3__Impl"
    // InternalUi23.g:1816:1: rule__InputText__Group__3__Impl : ( ( rule__InputText__ExpressionAssignment_3 ) ) ;
    public final void rule__InputText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1820:1: ( ( ( rule__InputText__ExpressionAssignment_3 ) ) )
            // InternalUi23.g:1821:1: ( ( rule__InputText__ExpressionAssignment_3 ) )
            {
            // InternalUi23.g:1821:1: ( ( rule__InputText__ExpressionAssignment_3 ) )
            // InternalUi23.g:1822:2: ( rule__InputText__ExpressionAssignment_3 )
            {
             before(grammarAccess.getInputTextAccess().getExpressionAssignment_3()); 
            // InternalUi23.g:1823:2: ( rule__InputText__ExpressionAssignment_3 )
            // InternalUi23.g:1823:3: rule__InputText__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputText__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getExpressionAssignment_3()); 

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
    // $ANTLR end "rule__InputText__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalUi23.g:1832:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1836:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalUi23.g:1837:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalUi23.g:1844:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1848:1: ( ( 'button' ) )
            // InternalUi23.g:1849:1: ( 'button' )
            {
            // InternalUi23.g:1849:1: ( 'button' )
            // InternalUi23.g:1850:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalUi23.g:1859:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1863:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalUi23.g:1864:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalUi23.g:1871:1: rule__Button__Group__1__Impl : ( ( '*' )? ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1875:1: ( ( ( '*' )? ) )
            // InternalUi23.g:1876:1: ( ( '*' )? )
            {
            // InternalUi23.g:1876:1: ( ( '*' )? )
            // InternalUi23.g:1877:2: ( '*' )?
            {
             before(grammarAccess.getButtonAccess().getAsteriskKeyword_1()); 
            // InternalUi23.g:1878:2: ( '*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUi23.g:1878:3: '*'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalUi23.g:1886:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1890:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalUi23.g:1891:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalUi23.g:1898:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1902:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalUi23.g:1903:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalUi23.g:1903:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalUi23.g:1904:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalUi23.g:1905:2: ( rule__Button__NameAssignment_2 )
            // InternalUi23.g:1905:3: rule__Button__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalUi23.g:1913:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1917:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalUi23.g:1918:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalUi23.g:1925:1: rule__Button__Group__3__Impl : ( ':' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1929:1: ( ( ':' ) )
            // InternalUi23.g:1930:1: ( ':' )
            {
            // InternalUi23.g:1930:1: ( ':' )
            // InternalUi23.g:1931:2: ':'
            {
             before(grammarAccess.getButtonAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalUi23.g:1940:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1944:1: ( rule__Button__Group__4__Impl )
            // InternalUi23.g:1945:2: rule__Button__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__4__Impl();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalUi23.g:1951:1: rule__Button__Group__4__Impl : ( ( rule__Button__ExpressionAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1955:1: ( ( ( rule__Button__ExpressionAssignment_4 ) ) )
            // InternalUi23.g:1956:1: ( ( rule__Button__ExpressionAssignment_4 ) )
            {
            // InternalUi23.g:1956:1: ( ( rule__Button__ExpressionAssignment_4 ) )
            // InternalUi23.g:1957:2: ( rule__Button__ExpressionAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getExpressionAssignment_4()); 
            // InternalUi23.g:1958:2: ( rule__Button__ExpressionAssignment_4 )
            // InternalUi23.g:1958:3: rule__Button__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getExpressionAssignment_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__FormUse__Group__0"
    // InternalUi23.g:1967:1: rule__FormUse__Group__0 : rule__FormUse__Group__0__Impl rule__FormUse__Group__1 ;
    public final void rule__FormUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1971:1: ( rule__FormUse__Group__0__Impl rule__FormUse__Group__1 )
            // InternalUi23.g:1972:2: rule__FormUse__Group__0__Impl rule__FormUse__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FormUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__1();

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
    // $ANTLR end "rule__FormUse__Group__0"


    // $ANTLR start "rule__FormUse__Group__0__Impl"
    // InternalUi23.g:1979:1: rule__FormUse__Group__0__Impl : ( ( rule__FormUse__NameAssignment_0 ) ) ;
    public final void rule__FormUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1983:1: ( ( ( rule__FormUse__NameAssignment_0 ) ) )
            // InternalUi23.g:1984:1: ( ( rule__FormUse__NameAssignment_0 ) )
            {
            // InternalUi23.g:1984:1: ( ( rule__FormUse__NameAssignment_0 ) )
            // InternalUi23.g:1985:2: ( rule__FormUse__NameAssignment_0 )
            {
             before(grammarAccess.getFormUseAccess().getNameAssignment_0()); 
            // InternalUi23.g:1986:2: ( rule__FormUse__NameAssignment_0 )
            // InternalUi23.g:1986:3: rule__FormUse__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FormUse__Group__0__Impl"


    // $ANTLR start "rule__FormUse__Group__1"
    // InternalUi23.g:1994:1: rule__FormUse__Group__1 : rule__FormUse__Group__1__Impl rule__FormUse__Group__2 ;
    public final void rule__FormUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:1998:1: ( rule__FormUse__Group__1__Impl rule__FormUse__Group__2 )
            // InternalUi23.g:1999:2: rule__FormUse__Group__1__Impl rule__FormUse__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FormUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__2();

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
    // $ANTLR end "rule__FormUse__Group__1"


    // $ANTLR start "rule__FormUse__Group__1__Impl"
    // InternalUi23.g:2006:1: rule__FormUse__Group__1__Impl : ( '(' ) ;
    public final void rule__FormUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2010:1: ( ( '(' ) )
            // InternalUi23.g:2011:1: ( '(' )
            {
            // InternalUi23.g:2011:1: ( '(' )
            // InternalUi23.g:2012:2: '('
            {
             before(grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FormUse__Group__1__Impl"


    // $ANTLR start "rule__FormUse__Group__2"
    // InternalUi23.g:2021:1: rule__FormUse__Group__2 : rule__FormUse__Group__2__Impl rule__FormUse__Group__3 ;
    public final void rule__FormUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2025:1: ( rule__FormUse__Group__2__Impl rule__FormUse__Group__3 )
            // InternalUi23.g:2026:2: rule__FormUse__Group__2__Impl rule__FormUse__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__FormUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__3();

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
    // $ANTLR end "rule__FormUse__Group__2"


    // $ANTLR start "rule__FormUse__Group__2__Impl"
    // InternalUi23.g:2033:1: rule__FormUse__Group__2__Impl : ( ( rule__FormUse__Group_2__0 )? ) ;
    public final void rule__FormUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2037:1: ( ( ( rule__FormUse__Group_2__0 )? ) )
            // InternalUi23.g:2038:1: ( ( rule__FormUse__Group_2__0 )? )
            {
            // InternalUi23.g:2038:1: ( ( rule__FormUse__Group_2__0 )? )
            // InternalUi23.g:2039:2: ( rule__FormUse__Group_2__0 )?
            {
             before(grammarAccess.getFormUseAccess().getGroup_2()); 
            // InternalUi23.g:2040:2: ( rule__FormUse__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||LA20_0==13||(LA20_0>=24 && LA20_0<=26)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUi23.g:2040:3: rule__FormUse__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormUse__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormUseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FormUse__Group__2__Impl"


    // $ANTLR start "rule__FormUse__Group__3"
    // InternalUi23.g:2048:1: rule__FormUse__Group__3 : rule__FormUse__Group__3__Impl ;
    public final void rule__FormUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2052:1: ( rule__FormUse__Group__3__Impl )
            // InternalUi23.g:2053:2: rule__FormUse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group__3__Impl();

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
    // $ANTLR end "rule__FormUse__Group__3"


    // $ANTLR start "rule__FormUse__Group__3__Impl"
    // InternalUi23.g:2059:1: rule__FormUse__Group__3__Impl : ( ')' ) ;
    public final void rule__FormUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2063:1: ( ( ')' ) )
            // InternalUi23.g:2064:1: ( ')' )
            {
            // InternalUi23.g:2064:1: ( ')' )
            // InternalUi23.g:2065:2: ')'
            {
             before(grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FormUse__Group__3__Impl"


    // $ANTLR start "rule__FormUse__Group_2__0"
    // InternalUi23.g:2075:1: rule__FormUse__Group_2__0 : rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1 ;
    public final void rule__FormUse__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2079:1: ( rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1 )
            // InternalUi23.g:2080:2: rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__FormUse__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2__1();

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
    // $ANTLR end "rule__FormUse__Group_2__0"


    // $ANTLR start "rule__FormUse__Group_2__0__Impl"
    // InternalUi23.g:2087:1: rule__FormUse__Group_2__0__Impl : ( ( rule__FormUse__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__FormUse__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2091:1: ( ( ( rule__FormUse__ExpressionsAssignment_2_0 ) ) )
            // InternalUi23.g:2092:1: ( ( rule__FormUse__ExpressionsAssignment_2_0 ) )
            {
            // InternalUi23.g:2092:1: ( ( rule__FormUse__ExpressionsAssignment_2_0 ) )
            // InternalUi23.g:2093:2: ( rule__FormUse__ExpressionsAssignment_2_0 )
            {
             before(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_0()); 
            // InternalUi23.g:2094:2: ( rule__FormUse__ExpressionsAssignment_2_0 )
            // InternalUi23.g:2094:3: rule__FormUse__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__ExpressionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_0()); 

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
    // $ANTLR end "rule__FormUse__Group_2__0__Impl"


    // $ANTLR start "rule__FormUse__Group_2__1"
    // InternalUi23.g:2102:1: rule__FormUse__Group_2__1 : rule__FormUse__Group_2__1__Impl ;
    public final void rule__FormUse__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2106:1: ( rule__FormUse__Group_2__1__Impl )
            // InternalUi23.g:2107:2: rule__FormUse__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2__1__Impl();

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
    // $ANTLR end "rule__FormUse__Group_2__1"


    // $ANTLR start "rule__FormUse__Group_2__1__Impl"
    // InternalUi23.g:2113:1: rule__FormUse__Group_2__1__Impl : ( ( rule__FormUse__Group_2_1__0 )* ) ;
    public final void rule__FormUse__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2117:1: ( ( ( rule__FormUse__Group_2_1__0 )* ) )
            // InternalUi23.g:2118:1: ( ( rule__FormUse__Group_2_1__0 )* )
            {
            // InternalUi23.g:2118:1: ( ( rule__FormUse__Group_2_1__0 )* )
            // InternalUi23.g:2119:2: ( rule__FormUse__Group_2_1__0 )*
            {
             before(grammarAccess.getFormUseAccess().getGroup_2_1()); 
            // InternalUi23.g:2120:2: ( rule__FormUse__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUi23.g:2120:3: rule__FormUse__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__FormUse__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormUseAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__FormUse__Group_2__1__Impl"


    // $ANTLR start "rule__FormUse__Group_2_1__0"
    // InternalUi23.g:2129:1: rule__FormUse__Group_2_1__0 : rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1 ;
    public final void rule__FormUse__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2133:1: ( rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1 )
            // InternalUi23.g:2134:2: rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__FormUse__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2_1__1();

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
    // $ANTLR end "rule__FormUse__Group_2_1__0"


    // $ANTLR start "rule__FormUse__Group_2_1__0__Impl"
    // InternalUi23.g:2141:1: rule__FormUse__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FormUse__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2145:1: ( ( ',' ) )
            // InternalUi23.g:2146:1: ( ',' )
            {
            // InternalUi23.g:2146:1: ( ',' )
            // InternalUi23.g:2147:2: ','
            {
             before(grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__FormUse__Group_2_1__0__Impl"


    // $ANTLR start "rule__FormUse__Group_2_1__1"
    // InternalUi23.g:2156:1: rule__FormUse__Group_2_1__1 : rule__FormUse__Group_2_1__1__Impl ;
    public final void rule__FormUse__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2160:1: ( rule__FormUse__Group_2_1__1__Impl )
            // InternalUi23.g:2161:2: rule__FormUse__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__FormUse__Group_2_1__1"


    // $ANTLR start "rule__FormUse__Group_2_1__1__Impl"
    // InternalUi23.g:2167:1: rule__FormUse__Group_2_1__1__Impl : ( ( rule__FormUse__ExpressionsAssignment_2_1_1 ) ) ;
    public final void rule__FormUse__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2171:1: ( ( ( rule__FormUse__ExpressionsAssignment_2_1_1 ) ) )
            // InternalUi23.g:2172:1: ( ( rule__FormUse__ExpressionsAssignment_2_1_1 ) )
            {
            // InternalUi23.g:2172:1: ( ( rule__FormUse__ExpressionsAssignment_2_1_1 ) )
            // InternalUi23.g:2173:2: ( rule__FormUse__ExpressionsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_1_1()); 
            // InternalUi23.g:2174:2: ( rule__FormUse__ExpressionsAssignment_2_1_1 )
            // InternalUi23.g:2174:3: rule__FormUse__ExpressionsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__ExpressionsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__FormUse__Group_2_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUi23.g:2183:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2187:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUi23.g:2188:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalUi23.g:2195:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2199:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUi23.g:2200:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUi23.g:2200:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUi23.g:2201:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUi23.g:2202:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUi23.g:2202:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalUi23.g:2210:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2214:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUi23.g:2215:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalUi23.g:2222:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2226:1: ( ( ':' ) )
            // InternalUi23.g:2227:1: ( ':' )
            {
            // InternalUi23.g:2227:1: ( ':' )
            // InternalUi23.g:2228:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalUi23.g:2237:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2241:1: ( rule__Parameter__Group__2__Impl )
            // InternalUi23.g:2242:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalUi23.g:2248:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2252:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalUi23.g:2253:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalUi23.g:2253:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalUi23.g:2254:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalUi23.g:2255:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalUi23.g:2255:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalUi23.g:2264:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2268:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalUi23.g:2269:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

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
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalUi23.g:2276:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2280:1: ( ( () ) )
            // InternalUi23.g:2281:1: ( () )
            {
            // InternalUi23.g:2281:1: ( () )
            // InternalUi23.g:2282:2: ()
            {
             before(grammarAccess.getTypeAccess().getBoolTypeAction_0_0()); 
            // InternalUi23.g:2283:2: ()
            // InternalUi23.g:2283:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getBoolTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalUi23.g:2291:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2295:1: ( rule__Type__Group_0__1__Impl )
            // InternalUi23.g:2296:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

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
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalUi23.g:2302:1: rule__Type__Group_0__1__Impl : ( 'boolean' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2306:1: ( ( 'boolean' ) )
            // InternalUi23.g:2307:1: ( 'boolean' )
            {
            // InternalUi23.g:2307:1: ( 'boolean' )
            // InternalUi23.g:2308:2: 'boolean'
            {
             before(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getBooleanKeyword_0_1()); 

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
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalUi23.g:2318:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2322:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalUi23.g:2323:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalUi23.g:2330:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2334:1: ( ( () ) )
            // InternalUi23.g:2335:1: ( () )
            {
            // InternalUi23.g:2335:1: ( () )
            // InternalUi23.g:2336:2: ()
            {
             before(grammarAccess.getTypeAccess().getStringTypeAction_1_0()); 
            // InternalUi23.g:2337:2: ()
            // InternalUi23.g:2337:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getStringTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalUi23.g:2345:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2349:1: ( rule__Type__Group_1__1__Impl )
            // InternalUi23.g:2350:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalUi23.g:2356:1: rule__Type__Group_1__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2360:1: ( ( 'string' ) )
            // InternalUi23.g:2361:1: ( 'string' )
            {
            // InternalUi23.g:2361:1: ( 'string' )
            // InternalUi23.g:2362:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_1_1()); 

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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalUi23.g:2372:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2376:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalUi23.g:2377:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

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
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalUi23.g:2384:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2388:1: ( ( () ) )
            // InternalUi23.g:2389:1: ( () )
            {
            // InternalUi23.g:2389:1: ( () )
            // InternalUi23.g:2390:2: ()
            {
             before(grammarAccess.getTypeAccess().getNumberTypeAction_2_0()); 
            // InternalUi23.g:2391:2: ()
            // InternalUi23.g:2391:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getNumberTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalUi23.g:2399:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2403:1: ( rule__Type__Group_2__1__Impl )
            // InternalUi23.g:2404:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

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
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalUi23.g:2410:1: rule__Type__Group_2__1__Impl : ( 'number' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2414:1: ( ( 'number' ) )
            // InternalUi23.g:2415:1: ( 'number' )
            {
            // InternalUi23.g:2415:1: ( 'number' )
            // InternalUi23.g:2416:2: 'number'
            {
             before(grammarAccess.getTypeAccess().getNumberKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNumberKeyword_2_1()); 

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
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalUi23.g:2426:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2430:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalUi23.g:2431:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalUi23.g:2438:1: rule__Exp__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2442:1: ( ( ruleEquality ) )
            // InternalUi23.g:2443:1: ( ruleEquality )
            {
            // InternalUi23.g:2443:1: ( ruleEquality )
            // InternalUi23.g:2444:2: ruleEquality
            {
             before(grammarAccess.getExpAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getExpAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalUi23.g:2453:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2457:1: ( rule__Exp__Group__1__Impl )
            // InternalUi23.g:2458:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalUi23.g:2464:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2468:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalUi23.g:2469:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalUi23.g:2469:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalUi23.g:2470:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalUi23.g:2471:2: ( rule__Exp__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUi23.g:2471:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalUi23.g:2480:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2484:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalUi23.g:2485:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalUi23.g:2492:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2496:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalUi23.g:2497:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalUi23.g:2497:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalUi23.g:2498:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalUi23.g:2499:2: ( rule__Exp__Alternatives_1_0 )
            // InternalUi23.g:2499:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalUi23.g:2507:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2511:1: ( rule__Exp__Group_1__1__Impl )
            // InternalUi23.g:2512:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalUi23.g:2518:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2522:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalUi23.g:2523:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:2523:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalUi23.g:2524:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:2525:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalUi23.g:2525:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalUi23.g:2534:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2538:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalUi23.g:2539:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

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
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalUi23.g:2546:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2550:1: ( ( () ) )
            // InternalUi23.g:2551:1: ( () )
            {
            // InternalUi23.g:2551:1: ( () )
            // InternalUi23.g:2552:2: ()
            {
             before(grammarAccess.getExpAccess().getAndLeftAction_1_0_0_0()); 
            // InternalUi23.g:2553:2: ()
            // InternalUi23.g:2553:3: 
            {
            }

             after(grammarAccess.getExpAccess().getAndLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalUi23.g:2561:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2565:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalUi23.g:2566:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalUi23.g:2572:1: rule__Exp__Group_1_0_0__1__Impl : ( '&&' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2576:1: ( ( '&&' ) )
            // InternalUi23.g:2577:1: ( '&&' )
            {
            // InternalUi23.g:2577:1: ( '&&' )
            // InternalUi23.g:2578:2: '&&'
            {
             before(grammarAccess.getExpAccess().getAmpersandAmpersandKeyword_1_0_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getAmpersandAmpersandKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__0"
    // InternalUi23.g:2588:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2592:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalUi23.g:2593:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Exp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1();

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
    // $ANTLR end "rule__Exp__Group_1_0_1__0"


    // $ANTLR start "rule__Exp__Group_1_0_1__0__Impl"
    // InternalUi23.g:2600:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2604:1: ( ( () ) )
            // InternalUi23.g:2605:1: ( () )
            {
            // InternalUi23.g:2605:1: ( () )
            // InternalUi23.g:2606:2: ()
            {
             before(grammarAccess.getExpAccess().getOrLeftAction_1_0_1_0()); 
            // InternalUi23.g:2607:2: ()
            // InternalUi23.g:2607:3: 
            {
            }

             after(grammarAccess.getExpAccess().getOrLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__1"
    // InternalUi23.g:2615:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2619:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalUi23.g:2620:2: rule__Exp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_0_1__1"


    // $ANTLR start "rule__Exp__Group_1_0_1__1__Impl"
    // InternalUi23.g:2626:1: rule__Exp__Group_1_0_1__1__Impl : ( '||' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2630:1: ( ( '||' ) )
            // InternalUi23.g:2631:1: ( '||' )
            {
            // InternalUi23.g:2631:1: ( '||' )
            // InternalUi23.g:2632:2: '||'
            {
             before(grammarAccess.getExpAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalUi23.g:2642:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2646:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalUi23.g:2647:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalUi23.g:2654:1: rule__Equality__Group__0__Impl : ( ruleCompare ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2658:1: ( ( ruleCompare ) )
            // InternalUi23.g:2659:1: ( ruleCompare )
            {
            // InternalUi23.g:2659:1: ( ruleCompare )
            // InternalUi23.g:2660:2: ruleCompare
            {
             before(grammarAccess.getEqualityAccess().getCompareParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getCompareParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalUi23.g:2669:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2673:1: ( rule__Equality__Group__1__Impl )
            // InternalUi23.g:2674:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalUi23.g:2680:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2684:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalUi23.g:2685:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalUi23.g:2685:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalUi23.g:2686:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalUi23.g:2687:2: ( rule__Equality__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=29 && LA23_0<=30)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUi23.g:2687:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalUi23.g:2696:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2700:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalUi23.g:2701:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalUi23.g:2708:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2712:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalUi23.g:2713:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalUi23.g:2713:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalUi23.g:2714:2: ( rule__Equality__Alternatives_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            // InternalUi23.g:2715:2: ( rule__Equality__Alternatives_1_0 )
            // InternalUi23.g:2715:3: rule__Equality__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalUi23.g:2723:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2727:1: ( rule__Equality__Group_1__1__Impl )
            // InternalUi23.g:2728:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalUi23.g:2734:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2738:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalUi23.g:2739:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:2739:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalUi23.g:2740:2: ( rule__Equality__RightAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:2741:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalUi23.g:2741:3: rule__Equality__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__0"
    // InternalUi23.g:2750:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2754:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalUi23.g:2755:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Equality__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1();

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
    // $ANTLR end "rule__Equality__Group_1_0_0__0"


    // $ANTLR start "rule__Equality__Group_1_0_0__0__Impl"
    // InternalUi23.g:2762:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2766:1: ( ( () ) )
            // InternalUi23.g:2767:1: ( () )
            {
            // InternalUi23.g:2767:1: ( () )
            // InternalUi23.g:2768:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEQLeftAction_1_0_0_0()); 
            // InternalUi23.g:2769:2: ()
            // InternalUi23.g:2769:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEQLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__1"
    // InternalUi23.g:2777:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2781:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalUi23.g:2782:2: rule__Equality__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1_0_0__1"


    // $ANTLR start "rule__Equality__Group_1_0_0__1__Impl"
    // InternalUi23.g:2788:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2792:1: ( ( '==' ) )
            // InternalUi23.g:2793:1: ( '==' )
            {
            // InternalUi23.g:2793:1: ( '==' )
            // InternalUi23.g:2794:2: '=='
            {
             before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Equality__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__0"
    // InternalUi23.g:2804:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2808:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalUi23.g:2809:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Equality__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1();

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
    // $ANTLR end "rule__Equality__Group_1_0_1__0"


    // $ANTLR start "rule__Equality__Group_1_0_1__0__Impl"
    // InternalUi23.g:2816:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2820:1: ( ( () ) )
            // InternalUi23.g:2821:1: ( () )
            {
            // InternalUi23.g:2821:1: ( () )
            // InternalUi23.g:2822:2: ()
            {
             before(grammarAccess.getEqualityAccess().getNEQLeftAction_1_0_1_0()); 
            // InternalUi23.g:2823:2: ()
            // InternalUi23.g:2823:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getNEQLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__1"
    // InternalUi23.g:2831:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2835:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalUi23.g:2836:2: rule__Equality__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1_0_1__1"


    // $ANTLR start "rule__Equality__Group_1_0_1__1__Impl"
    // InternalUi23.g:2842:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2846:1: ( ( '!=' ) )
            // InternalUi23.g:2847:1: ( '!=' )
            {
            // InternalUi23.g:2847:1: ( '!=' )
            // InternalUi23.g:2848:2: '!='
            {
             before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // InternalUi23.g:2858:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2862:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalUi23.g:2863:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Compare__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group__1();

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
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // InternalUi23.g:2870:1: rule__Compare__Group__0__Impl : ( ruleConcat ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2874:1: ( ( ruleConcat ) )
            // InternalUi23.g:2875:1: ( ruleConcat )
            {
            // InternalUi23.g:2875:1: ( ruleConcat )
            // InternalUi23.g:2876:2: ruleConcat
            {
             before(grammarAccess.getCompareAccess().getConcatParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getCompareAccess().getConcatParserRuleCall_0()); 

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
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // InternalUi23.g:2885:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2889:1: ( rule__Compare__Group__1__Impl )
            // InternalUi23.g:2890:2: rule__Compare__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__1__Impl();

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
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // InternalUi23.g:2896:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Group_1__0 )* ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2900:1: ( ( ( rule__Compare__Group_1__0 )* ) )
            // InternalUi23.g:2901:1: ( ( rule__Compare__Group_1__0 )* )
            {
            // InternalUi23.g:2901:1: ( ( rule__Compare__Group_1__0 )* )
            // InternalUi23.g:2902:2: ( rule__Compare__Group_1__0 )*
            {
             before(grammarAccess.getCompareAccess().getGroup_1()); 
            // InternalUi23.g:2903:2: ( rule__Compare__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=31 && LA24_0<=34)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUi23.g:2903:3: rule__Compare__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Compare__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCompareAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group_1__0"
    // InternalUi23.g:2912:1: rule__Compare__Group_1__0 : rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1 ;
    public final void rule__Compare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2916:1: ( rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1 )
            // InternalUi23.g:2917:2: rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Compare__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1__1();

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
    // $ANTLR end "rule__Compare__Group_1__0"


    // $ANTLR start "rule__Compare__Group_1__0__Impl"
    // InternalUi23.g:2924:1: rule__Compare__Group_1__0__Impl : ( ( rule__Compare__Alternatives_1_0 ) ) ;
    public final void rule__Compare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2928:1: ( ( ( rule__Compare__Alternatives_1_0 ) ) )
            // InternalUi23.g:2929:1: ( ( rule__Compare__Alternatives_1_0 ) )
            {
            // InternalUi23.g:2929:1: ( ( rule__Compare__Alternatives_1_0 ) )
            // InternalUi23.g:2930:2: ( rule__Compare__Alternatives_1_0 )
            {
             before(grammarAccess.getCompareAccess().getAlternatives_1_0()); 
            // InternalUi23.g:2931:2: ( rule__Compare__Alternatives_1_0 )
            // InternalUi23.g:2931:3: rule__Compare__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Compare__Group_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1__1"
    // InternalUi23.g:2939:1: rule__Compare__Group_1__1 : rule__Compare__Group_1__1__Impl ;
    public final void rule__Compare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2943:1: ( rule__Compare__Group_1__1__Impl )
            // InternalUi23.g:2944:2: rule__Compare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1__1__Impl();

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
    // $ANTLR end "rule__Compare__Group_1__1"


    // $ANTLR start "rule__Compare__Group_1__1__Impl"
    // InternalUi23.g:2950:1: rule__Compare__Group_1__1__Impl : ( ( rule__Compare__RightAssignment_1_1 ) ) ;
    public final void rule__Compare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2954:1: ( ( ( rule__Compare__RightAssignment_1_1 ) ) )
            // InternalUi23.g:2955:1: ( ( rule__Compare__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:2955:1: ( ( rule__Compare__RightAssignment_1_1 ) )
            // InternalUi23.g:2956:2: ( rule__Compare__RightAssignment_1_1 )
            {
             before(grammarAccess.getCompareAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:2957:2: ( rule__Compare__RightAssignment_1_1 )
            // InternalUi23.g:2957:3: rule__Compare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Compare__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Compare__Group_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_0__0"
    // InternalUi23.g:2966:1: rule__Compare__Group_1_0_0__0 : rule__Compare__Group_1_0_0__0__Impl rule__Compare__Group_1_0_0__1 ;
    public final void rule__Compare__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2970:1: ( rule__Compare__Group_1_0_0__0__Impl rule__Compare__Group_1_0_0__1 )
            // InternalUi23.g:2971:2: rule__Compare__Group_1_0_0__0__Impl rule__Compare__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Compare__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_0__1();

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
    // $ANTLR end "rule__Compare__Group_1_0_0__0"


    // $ANTLR start "rule__Compare__Group_1_0_0__0__Impl"
    // InternalUi23.g:2978:1: rule__Compare__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2982:1: ( ( () ) )
            // InternalUi23.g:2983:1: ( () )
            {
            // InternalUi23.g:2983:1: ( () )
            // InternalUi23.g:2984:2: ()
            {
             before(grammarAccess.getCompareAccess().getLTLeftAction_1_0_0_0()); 
            // InternalUi23.g:2985:2: ()
            // InternalUi23.g:2985:3: 
            {
            }

             after(grammarAccess.getCompareAccess().getLTLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_0__1"
    // InternalUi23.g:2993:1: rule__Compare__Group_1_0_0__1 : rule__Compare__Group_1_0_0__1__Impl ;
    public final void rule__Compare__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:2997:1: ( rule__Compare__Group_1_0_0__1__Impl )
            // InternalUi23.g:2998:2: rule__Compare__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Compare__Group_1_0_0__1"


    // $ANTLR start "rule__Compare__Group_1_0_0__1__Impl"
    // InternalUi23.g:3004:1: rule__Compare__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Compare__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3008:1: ( ( '<' ) )
            // InternalUi23.g:3009:1: ( '<' )
            {
            // InternalUi23.g:3009:1: ( '<' )
            // InternalUi23.g:3010:2: '<'
            {
             before(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Compare__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_1__0"
    // InternalUi23.g:3020:1: rule__Compare__Group_1_0_1__0 : rule__Compare__Group_1_0_1__0__Impl rule__Compare__Group_1_0_1__1 ;
    public final void rule__Compare__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3024:1: ( rule__Compare__Group_1_0_1__0__Impl rule__Compare__Group_1_0_1__1 )
            // InternalUi23.g:3025:2: rule__Compare__Group_1_0_1__0__Impl rule__Compare__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Compare__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_1__1();

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
    // $ANTLR end "rule__Compare__Group_1_0_1__0"


    // $ANTLR start "rule__Compare__Group_1_0_1__0__Impl"
    // InternalUi23.g:3032:1: rule__Compare__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3036:1: ( ( () ) )
            // InternalUi23.g:3037:1: ( () )
            {
            // InternalUi23.g:3037:1: ( () )
            // InternalUi23.g:3038:2: ()
            {
             before(grammarAccess.getCompareAccess().getLTELeftAction_1_0_1_0()); 
            // InternalUi23.g:3039:2: ()
            // InternalUi23.g:3039:3: 
            {
            }

             after(grammarAccess.getCompareAccess().getLTELeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_1__1"
    // InternalUi23.g:3047:1: rule__Compare__Group_1_0_1__1 : rule__Compare__Group_1_0_1__1__Impl ;
    public final void rule__Compare__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3051:1: ( rule__Compare__Group_1_0_1__1__Impl )
            // InternalUi23.g:3052:2: rule__Compare__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Compare__Group_1_0_1__1"


    // $ANTLR start "rule__Compare__Group_1_0_1__1__Impl"
    // InternalUi23.g:3058:1: rule__Compare__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Compare__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3062:1: ( ( '<=' ) )
            // InternalUi23.g:3063:1: ( '<=' )
            {
            // InternalUi23.g:3063:1: ( '<=' )
            // InternalUi23.g:3064:2: '<='
            {
             before(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Compare__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_2__0"
    // InternalUi23.g:3074:1: rule__Compare__Group_1_0_2__0 : rule__Compare__Group_1_0_2__0__Impl rule__Compare__Group_1_0_2__1 ;
    public final void rule__Compare__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3078:1: ( rule__Compare__Group_1_0_2__0__Impl rule__Compare__Group_1_0_2__1 )
            // InternalUi23.g:3079:2: rule__Compare__Group_1_0_2__0__Impl rule__Compare__Group_1_0_2__1
            {
            pushFollow(FOLLOW_35);
            rule__Compare__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_2__1();

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
    // $ANTLR end "rule__Compare__Group_1_0_2__0"


    // $ANTLR start "rule__Compare__Group_1_0_2__0__Impl"
    // InternalUi23.g:3086:1: rule__Compare__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3090:1: ( ( () ) )
            // InternalUi23.g:3091:1: ( () )
            {
            // InternalUi23.g:3091:1: ( () )
            // InternalUi23.g:3092:2: ()
            {
             before(grammarAccess.getCompareAccess().getGTLeftAction_1_0_2_0()); 
            // InternalUi23.g:3093:2: ()
            // InternalUi23.g:3093:3: 
            {
            }

             after(grammarAccess.getCompareAccess().getGTLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_2__1"
    // InternalUi23.g:3101:1: rule__Compare__Group_1_0_2__1 : rule__Compare__Group_1_0_2__1__Impl ;
    public final void rule__Compare__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3105:1: ( rule__Compare__Group_1_0_2__1__Impl )
            // InternalUi23.g:3106:2: rule__Compare__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__Compare__Group_1_0_2__1"


    // $ANTLR start "rule__Compare__Group_1_0_2__1__Impl"
    // InternalUi23.g:3112:1: rule__Compare__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Compare__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3116:1: ( ( '>' ) )
            // InternalUi23.g:3117:1: ( '>' )
            {
            // InternalUi23.g:3117:1: ( '>' )
            // InternalUi23.g:3118:2: '>'
            {
             before(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_2_1()); 

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
    // $ANTLR end "rule__Compare__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_3__0"
    // InternalUi23.g:3128:1: rule__Compare__Group_1_0_3__0 : rule__Compare__Group_1_0_3__0__Impl rule__Compare__Group_1_0_3__1 ;
    public final void rule__Compare__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3132:1: ( rule__Compare__Group_1_0_3__0__Impl rule__Compare__Group_1_0_3__1 )
            // InternalUi23.g:3133:2: rule__Compare__Group_1_0_3__0__Impl rule__Compare__Group_1_0_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Compare__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_3__1();

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
    // $ANTLR end "rule__Compare__Group_1_0_3__0"


    // $ANTLR start "rule__Compare__Group_1_0_3__0__Impl"
    // InternalUi23.g:3140:1: rule__Compare__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3144:1: ( ( () ) )
            // InternalUi23.g:3145:1: ( () )
            {
            // InternalUi23.g:3145:1: ( () )
            // InternalUi23.g:3146:2: ()
            {
             before(grammarAccess.getCompareAccess().getGTELeftAction_1_0_3_0()); 
            // InternalUi23.g:3147:2: ()
            // InternalUi23.g:3147:3: 
            {
            }

             after(grammarAccess.getCompareAccess().getGTELeftAction_1_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0_3__1"
    // InternalUi23.g:3155:1: rule__Compare__Group_1_0_3__1 : rule__Compare__Group_1_0_3__1__Impl ;
    public final void rule__Compare__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3159:1: ( rule__Compare__Group_1_0_3__1__Impl )
            // InternalUi23.g:3160:2: rule__Compare__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0_3__1__Impl();

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
    // $ANTLR end "rule__Compare__Group_1_0_3__1"


    // $ANTLR start "rule__Compare__Group_1_0_3__1__Impl"
    // InternalUi23.g:3166:1: rule__Compare__Group_1_0_3__1__Impl : ( '>=' ) ;
    public final void rule__Compare__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3170:1: ( ( '>=' ) )
            // InternalUi23.g:3171:1: ( '>=' )
            {
            // InternalUi23.g:3171:1: ( '>=' )
            // InternalUi23.g:3172:2: '>='
            {
             before(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1()); 

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
    // $ANTLR end "rule__Compare__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Concat__Group__0"
    // InternalUi23.g:3182:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3186:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // InternalUi23.g:3187:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Concat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group__1();

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
    // $ANTLR end "rule__Concat__Group__0"


    // $ANTLR start "rule__Concat__Group__0__Impl"
    // InternalUi23.g:3194:1: rule__Concat__Group__0__Impl : ( ruleAddMinus ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3198:1: ( ( ruleAddMinus ) )
            // InternalUi23.g:3199:1: ( ruleAddMinus )
            {
            // InternalUi23.g:3199:1: ( ruleAddMinus )
            // InternalUi23.g:3200:2: ruleAddMinus
            {
             before(grammarAccess.getConcatAccess().getAddMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAddMinus();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getAddMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Concat__Group__0__Impl"


    // $ANTLR start "rule__Concat__Group__1"
    // InternalUi23.g:3209:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3213:1: ( rule__Concat__Group__1__Impl )
            // InternalUi23.g:3214:2: rule__Concat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__1__Impl();

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
    // $ANTLR end "rule__Concat__Group__1"


    // $ANTLR start "rule__Concat__Group__1__Impl"
    // InternalUi23.g:3220:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Group_1__0 )* ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3224:1: ( ( ( rule__Concat__Group_1__0 )* ) )
            // InternalUi23.g:3225:1: ( ( rule__Concat__Group_1__0 )* )
            {
            // InternalUi23.g:3225:1: ( ( rule__Concat__Group_1__0 )* )
            // InternalUi23.g:3226:2: ( rule__Concat__Group_1__0 )*
            {
             before(grammarAccess.getConcatAccess().getGroup_1()); 
            // InternalUi23.g:3227:2: ( rule__Concat__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUi23.g:3227:3: rule__Concat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Concat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConcatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Concat__Group__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__0"
    // InternalUi23.g:3236:1: rule__Concat__Group_1__0 : rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 ;
    public final void rule__Concat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3240:1: ( rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 )
            // InternalUi23.g:3241:2: rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Concat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group_1__1();

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
    // $ANTLR end "rule__Concat__Group_1__0"


    // $ANTLR start "rule__Concat__Group_1__0__Impl"
    // InternalUi23.g:3248:1: rule__Concat__Group_1__0__Impl : ( ( rule__Concat__Group_1_0__0 ) ) ;
    public final void rule__Concat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3252:1: ( ( ( rule__Concat__Group_1_0__0 ) ) )
            // InternalUi23.g:3253:1: ( ( rule__Concat__Group_1_0__0 ) )
            {
            // InternalUi23.g:3253:1: ( ( rule__Concat__Group_1_0__0 ) )
            // InternalUi23.g:3254:2: ( rule__Concat__Group_1_0__0 )
            {
             before(grammarAccess.getConcatAccess().getGroup_1_0()); 
            // InternalUi23.g:3255:2: ( rule__Concat__Group_1_0__0 )
            // InternalUi23.g:3255:3: rule__Concat__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__Concat__Group_1__0__Impl"


    // $ANTLR start "rule__Concat__Group_1__1"
    // InternalUi23.g:3263:1: rule__Concat__Group_1__1 : rule__Concat__Group_1__1__Impl ;
    public final void rule__Concat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3267:1: ( rule__Concat__Group_1__1__Impl )
            // InternalUi23.g:3268:2: rule__Concat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group_1__1__Impl();

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
    // $ANTLR end "rule__Concat__Group_1__1"


    // $ANTLR start "rule__Concat__Group_1__1__Impl"
    // InternalUi23.g:3274:1: rule__Concat__Group_1__1__Impl : ( ( rule__Concat__RightAssignment_1_1 ) ) ;
    public final void rule__Concat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3278:1: ( ( ( rule__Concat__RightAssignment_1_1 ) ) )
            // InternalUi23.g:3279:1: ( ( rule__Concat__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:3279:1: ( ( rule__Concat__RightAssignment_1_1 ) )
            // InternalUi23.g:3280:2: ( rule__Concat__RightAssignment_1_1 )
            {
             before(grammarAccess.getConcatAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:3281:2: ( rule__Concat__RightAssignment_1_1 )
            // InternalUi23.g:3281:3: rule__Concat__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Concat__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Concat__Group_1__1__Impl"


    // $ANTLR start "rule__Concat__Group_1_0__0"
    // InternalUi23.g:3290:1: rule__Concat__Group_1_0__0 : rule__Concat__Group_1_0__0__Impl rule__Concat__Group_1_0__1 ;
    public final void rule__Concat__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3294:1: ( rule__Concat__Group_1_0__0__Impl rule__Concat__Group_1_0__1 )
            // InternalUi23.g:3295:2: rule__Concat__Group_1_0__0__Impl rule__Concat__Group_1_0__1
            {
            pushFollow(FOLLOW_36);
            rule__Concat__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group_1_0__1();

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
    // $ANTLR end "rule__Concat__Group_1_0__0"


    // $ANTLR start "rule__Concat__Group_1_0__0__Impl"
    // InternalUi23.g:3302:1: rule__Concat__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Concat__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3306:1: ( ( () ) )
            // InternalUi23.g:3307:1: ( () )
            {
            // InternalUi23.g:3307:1: ( () )
            // InternalUi23.g:3308:2: ()
            {
             before(grammarAccess.getConcatAccess().getConcLeftAction_1_0_0()); 
            // InternalUi23.g:3309:2: ()
            // InternalUi23.g:3309:3: 
            {
            }

             after(grammarAccess.getConcatAccess().getConcLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1_0__0__Impl"


    // $ANTLR start "rule__Concat__Group_1_0__1"
    // InternalUi23.g:3317:1: rule__Concat__Group_1_0__1 : rule__Concat__Group_1_0__1__Impl ;
    public final void rule__Concat__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3321:1: ( rule__Concat__Group_1_0__1__Impl )
            // InternalUi23.g:3322:2: rule__Concat__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Concat__Group_1_0__1"


    // $ANTLR start "rule__Concat__Group_1_0__1__Impl"
    // InternalUi23.g:3328:1: rule__Concat__Group_1_0__1__Impl : ( '&' ) ;
    public final void rule__Concat__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3332:1: ( ( '&' ) )
            // InternalUi23.g:3333:1: ( '&' )
            {
            // InternalUi23.g:3333:1: ( '&' )
            // InternalUi23.g:3334:2: '&'
            {
             before(grammarAccess.getConcatAccess().getAmpersandKeyword_1_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConcatAccess().getAmpersandKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Concat__Group_1_0__1__Impl"


    // $ANTLR start "rule__AddMinus__Group__0"
    // InternalUi23.g:3344:1: rule__AddMinus__Group__0 : rule__AddMinus__Group__0__Impl rule__AddMinus__Group__1 ;
    public final void rule__AddMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3348:1: ( rule__AddMinus__Group__0__Impl rule__AddMinus__Group__1 )
            // InternalUi23.g:3349:2: rule__AddMinus__Group__0__Impl rule__AddMinus__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__AddMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddMinus__Group__1();

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
    // $ANTLR end "rule__AddMinus__Group__0"


    // $ANTLR start "rule__AddMinus__Group__0__Impl"
    // InternalUi23.g:3356:1: rule__AddMinus__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__AddMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3360:1: ( ( ruleFactor ) )
            // InternalUi23.g:3361:1: ( ruleFactor )
            {
            // InternalUi23.g:3361:1: ( ruleFactor )
            // InternalUi23.g:3362:2: ruleFactor
            {
             before(grammarAccess.getAddMinusAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getAddMinusAccess().getFactorParserRuleCall_0()); 

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
    // $ANTLR end "rule__AddMinus__Group__0__Impl"


    // $ANTLR start "rule__AddMinus__Group__1"
    // InternalUi23.g:3371:1: rule__AddMinus__Group__1 : rule__AddMinus__Group__1__Impl ;
    public final void rule__AddMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3375:1: ( rule__AddMinus__Group__1__Impl )
            // InternalUi23.g:3376:2: rule__AddMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Group__1__Impl();

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
    // $ANTLR end "rule__AddMinus__Group__1"


    // $ANTLR start "rule__AddMinus__Group__1__Impl"
    // InternalUi23.g:3382:1: rule__AddMinus__Group__1__Impl : ( ( rule__AddMinus__Group_1__0 )* ) ;
    public final void rule__AddMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3386:1: ( ( ( rule__AddMinus__Group_1__0 )* ) )
            // InternalUi23.g:3387:1: ( ( rule__AddMinus__Group_1__0 )* )
            {
            // InternalUi23.g:3387:1: ( ( rule__AddMinus__Group_1__0 )* )
            // InternalUi23.g:3388:2: ( rule__AddMinus__Group_1__0 )*
            {
             before(grammarAccess.getAddMinusAccess().getGroup_1()); 
            // InternalUi23.g:3389:2: ( rule__AddMinus__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=36 && LA26_0<=37)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUi23.g:3389:3: rule__AddMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__AddMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAddMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AddMinus__Group__1__Impl"


    // $ANTLR start "rule__AddMinus__Group_1__0"
    // InternalUi23.g:3398:1: rule__AddMinus__Group_1__0 : rule__AddMinus__Group_1__0__Impl rule__AddMinus__Group_1__1 ;
    public final void rule__AddMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3402:1: ( rule__AddMinus__Group_1__0__Impl rule__AddMinus__Group_1__1 )
            // InternalUi23.g:3403:2: rule__AddMinus__Group_1__0__Impl rule__AddMinus__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__AddMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1__1();

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
    // $ANTLR end "rule__AddMinus__Group_1__0"


    // $ANTLR start "rule__AddMinus__Group_1__0__Impl"
    // InternalUi23.g:3410:1: rule__AddMinus__Group_1__0__Impl : ( ( rule__AddMinus__Alternatives_1_0 ) ) ;
    public final void rule__AddMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3414:1: ( ( ( rule__AddMinus__Alternatives_1_0 ) ) )
            // InternalUi23.g:3415:1: ( ( rule__AddMinus__Alternatives_1_0 ) )
            {
            // InternalUi23.g:3415:1: ( ( rule__AddMinus__Alternatives_1_0 ) )
            // InternalUi23.g:3416:2: ( rule__AddMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getAddMinusAccess().getAlternatives_1_0()); 
            // InternalUi23.g:3417:2: ( rule__AddMinus__Alternatives_1_0 )
            // InternalUi23.g:3417:3: rule__AddMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__AddMinus__Group_1__0__Impl"


    // $ANTLR start "rule__AddMinus__Group_1__1"
    // InternalUi23.g:3425:1: rule__AddMinus__Group_1__1 : rule__AddMinus__Group_1__1__Impl ;
    public final void rule__AddMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3429:1: ( rule__AddMinus__Group_1__1__Impl )
            // InternalUi23.g:3430:2: rule__AddMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__AddMinus__Group_1__1"


    // $ANTLR start "rule__AddMinus__Group_1__1__Impl"
    // InternalUi23.g:3436:1: rule__AddMinus__Group_1__1__Impl : ( ( rule__AddMinus__RightAssignment_1_1 ) ) ;
    public final void rule__AddMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3440:1: ( ( ( rule__AddMinus__RightAssignment_1_1 ) ) )
            // InternalUi23.g:3441:1: ( ( rule__AddMinus__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:3441:1: ( ( rule__AddMinus__RightAssignment_1_1 ) )
            // InternalUi23.g:3442:2: ( rule__AddMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getAddMinusAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:3443:2: ( rule__AddMinus__RightAssignment_1_1 )
            // InternalUi23.g:3443:3: rule__AddMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__AddMinus__Group_1__1__Impl"


    // $ANTLR start "rule__AddMinus__Group_1_0_0__0"
    // InternalUi23.g:3452:1: rule__AddMinus__Group_1_0_0__0 : rule__AddMinus__Group_1_0_0__0__Impl rule__AddMinus__Group_1_0_0__1 ;
    public final void rule__AddMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3456:1: ( rule__AddMinus__Group_1_0_0__0__Impl rule__AddMinus__Group_1_0_0__1 )
            // InternalUi23.g:3457:2: rule__AddMinus__Group_1_0_0__0__Impl rule__AddMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
            rule__AddMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__AddMinus__Group_1_0_0__0"


    // $ANTLR start "rule__AddMinus__Group_1_0_0__0__Impl"
    // InternalUi23.g:3464:1: rule__AddMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3468:1: ( ( () ) )
            // InternalUi23.g:3469:1: ( () )
            {
            // InternalUi23.g:3469:1: ( () )
            // InternalUi23.g:3470:2: ()
            {
             before(grammarAccess.getAddMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalUi23.g:3471:2: ()
            // InternalUi23.g:3471:3: 
            {
            }

             after(grammarAccess.getAddMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AddMinus__Group_1_0_0__1"
    // InternalUi23.g:3479:1: rule__AddMinus__Group_1_0_0__1 : rule__AddMinus__Group_1_0_0__1__Impl ;
    public final void rule__AddMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3483:1: ( rule__AddMinus__Group_1_0_0__1__Impl )
            // InternalUi23.g:3484:2: rule__AddMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__AddMinus__Group_1_0_0__1"


    // $ANTLR start "rule__AddMinus__Group_1_0_0__1__Impl"
    // InternalUi23.g:3490:1: rule__AddMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3494:1: ( ( '+' ) )
            // InternalUi23.g:3495:1: ( '+' )
            {
            // InternalUi23.g:3495:1: ( '+' )
            // InternalUi23.g:3496:2: '+'
            {
             before(grammarAccess.getAddMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAddMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__AddMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AddMinus__Group_1_0_1__0"
    // InternalUi23.g:3506:1: rule__AddMinus__Group_1_0_1__0 : rule__AddMinus__Group_1_0_1__0__Impl rule__AddMinus__Group_1_0_1__1 ;
    public final void rule__AddMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3510:1: ( rule__AddMinus__Group_1_0_1__0__Impl rule__AddMinus__Group_1_0_1__1 )
            // InternalUi23.g:3511:2: rule__AddMinus__Group_1_0_1__0__Impl rule__AddMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
            rule__AddMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__AddMinus__Group_1_0_1__0"


    // $ANTLR start "rule__AddMinus__Group_1_0_1__0__Impl"
    // InternalUi23.g:3518:1: rule__AddMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3522:1: ( ( () ) )
            // InternalUi23.g:3523:1: ( () )
            {
            // InternalUi23.g:3523:1: ( () )
            // InternalUi23.g:3524:2: ()
            {
             before(grammarAccess.getAddMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalUi23.g:3525:2: ()
            // InternalUi23.g:3525:3: 
            {
            }

             after(grammarAccess.getAddMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AddMinus__Group_1_0_1__1"
    // InternalUi23.g:3533:1: rule__AddMinus__Group_1_0_1__1 : rule__AddMinus__Group_1_0_1__1__Impl ;
    public final void rule__AddMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3537:1: ( rule__AddMinus__Group_1_0_1__1__Impl )
            // InternalUi23.g:3538:2: rule__AddMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__AddMinus__Group_1_0_1__1"


    // $ANTLR start "rule__AddMinus__Group_1_0_1__1__Impl"
    // InternalUi23.g:3544:1: rule__AddMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3548:1: ( ( '-' ) )
            // InternalUi23.g:3549:1: ( '-' )
            {
            // InternalUi23.g:3549:1: ( '-' )
            // InternalUi23.g:3550:2: '-'
            {
             before(grammarAccess.getAddMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAddMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__AddMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalUi23.g:3560:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3564:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalUi23.g:3565:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalUi23.g:3572:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3576:1: ( ( rulePrimary ) )
            // InternalUi23.g:3577:1: ( rulePrimary )
            {
            // InternalUi23.g:3577:1: ( rulePrimary )
            // InternalUi23.g:3578:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalUi23.g:3587:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3591:1: ( rule__Factor__Group__1__Impl )
            // InternalUi23.g:3592:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalUi23.g:3598:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3602:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalUi23.g:3603:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalUi23.g:3603:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalUi23.g:3604:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalUi23.g:3605:2: ( rule__Factor__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23||LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUi23.g:3605:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalUi23.g:3614:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3618:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalUi23.g:3619:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalUi23.g:3626:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3630:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalUi23.g:3631:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalUi23.g:3631:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalUi23.g:3632:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalUi23.g:3633:2: ( rule__Factor__Alternatives_1_0 )
            // InternalUi23.g:3633:3: rule__Factor__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalUi23.g:3641:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3645:1: ( rule__Factor__Group_1__1__Impl )
            // InternalUi23.g:3646:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalUi23.g:3652:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3656:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalUi23.g:3657:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalUi23.g:3657:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalUi23.g:3658:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalUi23.g:3659:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalUi23.g:3659:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__0"
    // InternalUi23.g:3668:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3672:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalUi23.g:3673:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
            {
            pushFollow(FOLLOW_43);
            rule__Factor__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1();

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
    // $ANTLR end "rule__Factor__Group_1_0_0__0"


    // $ANTLR start "rule__Factor__Group_1_0_0__0__Impl"
    // InternalUi23.g:3680:1: rule__Factor__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3684:1: ( ( () ) )
            // InternalUi23.g:3685:1: ( () )
            {
            // InternalUi23.g:3685:1: ( () )
            // InternalUi23.g:3686:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0()); 
            // InternalUi23.g:3687:2: ()
            // InternalUi23.g:3687:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__1"
    // InternalUi23.g:3695:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3699:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalUi23.g:3700:2: rule__Factor__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1_0_0__1"


    // $ANTLR start "rule__Factor__Group_1_0_0__1__Impl"
    // InternalUi23.g:3706:1: rule__Factor__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3710:1: ( ( '*' ) )
            // InternalUi23.g:3711:1: ( '*' )
            {
            // InternalUi23.g:3711:1: ( '*' )
            // InternalUi23.g:3712:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Factor__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__0"
    // InternalUi23.g:3722:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3726:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalUi23.g:3727:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Factor__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1();

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
    // $ANTLR end "rule__Factor__Group_1_0_1__0"


    // $ANTLR start "rule__Factor__Group_1_0_1__0__Impl"
    // InternalUi23.g:3734:1: rule__Factor__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3738:1: ( ( () ) )
            // InternalUi23.g:3739:1: ( () )
            {
            // InternalUi23.g:3739:1: ( () )
            // InternalUi23.g:3740:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0()); 
            // InternalUi23.g:3741:2: ()
            // InternalUi23.g:3741:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__1"
    // InternalUi23.g:3749:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3753:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalUi23.g:3754:2: rule__Factor__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1_0_1__1"


    // $ANTLR start "rule__Factor__Group_1_0_1__1__Impl"
    // InternalUi23.g:3760:1: rule__Factor__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3764:1: ( ( '/' ) )
            // InternalUi23.g:3765:1: ( '/' )
            {
            // InternalUi23.g:3765:1: ( '/' )
            // InternalUi23.g:3766:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Factor__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalUi23.g:3776:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3780:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalUi23.g:3781:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_44);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalUi23.g:3788:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3792:1: ( ( () ) )
            // InternalUi23.g:3793:1: ( () )
            {
            // InternalUi23.g:3793:1: ( () )
            // InternalUi23.g:3794:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getValueIntAction_0_0()); 
            // InternalUi23.g:3795:2: ()
            // InternalUi23.g:3795:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getValueIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalUi23.g:3803:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3807:1: ( rule__Primary__Group_0__1__Impl )
            // InternalUi23.g:3808:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalUi23.g:3814:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3818:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalUi23.g:3819:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalUi23.g:3819:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalUi23.g:3820:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalUi23.g:3821:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalUi23.g:3821:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalUi23.g:3830:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3834:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalUi23.g:3835:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalUi23.g:3842:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3846:1: ( ( () ) )
            // InternalUi23.g:3847:1: ( () )
            {
            // InternalUi23.g:3847:1: ( () )
            // InternalUi23.g:3848:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getValueStringAction_1_0()); 
            // InternalUi23.g:3849:2: ()
            // InternalUi23.g:3849:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getValueStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalUi23.g:3857:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3861:1: ( rule__Primary__Group_1__1__Impl )
            // InternalUi23.g:3862:2: rule__Primary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalUi23.g:3868:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__ValueAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3872:1: ( ( ( rule__Primary__ValueAssignment_1_1 ) ) )
            // InternalUi23.g:3873:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            {
            // InternalUi23.g:3873:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            // InternalUi23.g:3874:2: ( rule__Primary__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 
            // InternalUi23.g:3875:2: ( rule__Primary__ValueAssignment_1_1 )
            // InternalUi23.g:3875:3: rule__Primary__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalUi23.g:3884:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3888:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalUi23.g:3889:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalUi23.g:3896:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3900:1: ( ( '(' ) )
            // InternalUi23.g:3901:1: ( '(' )
            {
            // InternalUi23.g:3901:1: ( '(' )
            // InternalUi23.g:3902:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalUi23.g:3911:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3915:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalUi23.g:3916:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_46);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalUi23.g:3923:1: rule__Primary__Group_2__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3927:1: ( ( ruleExp ) )
            // InternalUi23.g:3928:1: ( ruleExp )
            {
            // InternalUi23.g:3928:1: ( ruleExp )
            // InternalUi23.g:3929:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalUi23.g:3938:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3942:1: ( rule__Primary__Group_2__2__Impl )
            // InternalUi23.g:3943:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalUi23.g:3949:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3953:1: ( ( ')' ) )
            // InternalUi23.g:3954:1: ( ')' )
            {
            // InternalUi23.g:3954:1: ( ')' )
            // InternalUi23.g:3955:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__UI__TitleAssignment_1"
    // InternalUi23.g:3965:1: rule__UI__TitleAssignment_1 : ( RULE_ID ) ;
    public final void rule__UI__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3969:1: ( ( RULE_ID ) )
            // InternalUi23.g:3970:2: ( RULE_ID )
            {
            // InternalUi23.g:3970:2: ( RULE_ID )
            // InternalUi23.g:3971:3: RULE_ID
            {
             before(grammarAccess.getUIAccess().getTitleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUIAccess().getTitleIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UI__TitleAssignment_1"


    // $ANTLR start "rule__UI__FunctionsAssignment_2"
    // InternalUi23.g:3980:1: rule__UI__FunctionsAssignment_2 : ( ruleFunction ) ;
    public final void rule__UI__FunctionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3984:1: ( ( ruleFunction ) )
            // InternalUi23.g:3985:2: ( ruleFunction )
            {
            // InternalUi23.g:3985:2: ( ruleFunction )
            // InternalUi23.g:3986:3: ruleFunction
            {
             before(grammarAccess.getUIAccess().getFunctionsFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getUIAccess().getFunctionsFunctionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UI__FunctionsAssignment_2"


    // $ANTLR start "rule__UI__FormsAssignment_3"
    // InternalUi23.g:3995:1: rule__UI__FormsAssignment_3 : ( ruleForm ) ;
    public final void rule__UI__FormsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:3999:1: ( ( ruleForm ) )
            // InternalUi23.g:4000:2: ( ruleForm )
            {
            // InternalUi23.g:4000:2: ( ruleForm )
            // InternalUi23.g:4001:3: ruleForm
            {
             before(grammarAccess.getUIAccess().getFormsFormParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getUIAccess().getFormsFormParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UI__FormsAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalUi23.g:4010:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4014:1: ( ( RULE_ID ) )
            // InternalUi23.g:4015:2: ( RULE_ID )
            {
            // InternalUi23.g:4015:2: ( RULE_ID )
            // InternalUi23.g:4016:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__TypesAssignment_3_0"
    // InternalUi23.g:4025:1: rule__Function__TypesAssignment_3_0 : ( ruleType ) ;
    public final void rule__Function__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4029:1: ( ( ruleType ) )
            // InternalUi23.g:4030:2: ( ruleType )
            {
            // InternalUi23.g:4030:2: ( ruleType )
            // InternalUi23.g:4031:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Function__TypesAssignment_3_0"


    // $ANTLR start "rule__Function__TypesAssignment_3_1_1"
    // InternalUi23.g:4040:1: rule__Function__TypesAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Function__TypesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4044:1: ( ( ruleType ) )
            // InternalUi23.g:4045:2: ( ruleType )
            {
            // InternalUi23.g:4045:2: ( ruleType )
            // InternalUi23.g:4046:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Function__TypesAssignment_3_1_1"


    // $ANTLR start "rule__Function__TypesAssignment_6"
    // InternalUi23.g:4055:1: rule__Function__TypesAssignment_6 : ( ruleType ) ;
    public final void rule__Function__TypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4059:1: ( ( ruleType ) )
            // InternalUi23.g:4060:2: ( ruleType )
            {
            // InternalUi23.g:4060:2: ( ruleType )
            // InternalUi23.g:4061:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Function__TypesAssignment_6"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalUi23.g:4070:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4074:1: ( ( RULE_ID ) )
            // InternalUi23.g:4075:2: ( RULE_ID )
            {
            // InternalUi23.g:4075:2: ( RULE_ID )
            // InternalUi23.g:4076:3: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__ParametersAssignment_2_1_0"
    // InternalUi23.g:4085:1: rule__Form__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Form__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4089:1: ( ( ruleParameter ) )
            // InternalUi23.g:4090:2: ( ruleParameter )
            {
            // InternalUi23.g:4090:2: ( ruleParameter )
            // InternalUi23.g:4091:3: ruleParameter
            {
             before(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__Form__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Form__ParametersAssignment_2_1_1_1"
    // InternalUi23.g:4100:1: rule__Form__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Form__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4104:1: ( ( ruleParameter ) )
            // InternalUi23.g:4105:2: ( ruleParameter )
            {
            // InternalUi23.g:4105:2: ( ruleParameter )
            // InternalUi23.g:4106:3: ruleParameter
            {
             before(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__Form__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Form__LayoutAssignment_4"
    // InternalUi23.g:4115:1: rule__Form__LayoutAssignment_4 : ( ruleLayout ) ;
    public final void rule__Form__LayoutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4119:1: ( ( ruleLayout ) )
            // InternalUi23.g:4120:2: ( ruleLayout )
            {
            // InternalUi23.g:4120:2: ( ruleLayout )
            // InternalUi23.g:4121:3: ruleLayout
            {
             before(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Form__LayoutAssignment_4"


    // $ANTLR start "rule__Layout__NameAssignment_0_0"
    // InternalUi23.g:4130:1: rule__Layout__NameAssignment_0_0 : ( ( 'row' ) ) ;
    public final void rule__Layout__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4134:1: ( ( ( 'row' ) ) )
            // InternalUi23.g:4135:2: ( ( 'row' ) )
            {
            // InternalUi23.g:4135:2: ( ( 'row' ) )
            // InternalUi23.g:4136:3: ( 'row' )
            {
             before(grammarAccess.getLayoutAccess().getNameRowKeyword_0_0_0()); 
            // InternalUi23.g:4137:3: ( 'row' )
            // InternalUi23.g:4138:4: 'row'
            {
             before(grammarAccess.getLayoutAccess().getNameRowKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getNameRowKeyword_0_0_0()); 

            }

             after(grammarAccess.getLayoutAccess().getNameRowKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Layout__NameAssignment_0_0"


    // $ANTLR start "rule__Layout__NameAssignment_0_1"
    // InternalUi23.g:4149:1: rule__Layout__NameAssignment_0_1 : ( ( 'column' ) ) ;
    public final void rule__Layout__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4153:1: ( ( ( 'column' ) ) )
            // InternalUi23.g:4154:2: ( ( 'column' ) )
            {
            // InternalUi23.g:4154:2: ( ( 'column' ) )
            // InternalUi23.g:4155:3: ( 'column' )
            {
             before(grammarAccess.getLayoutAccess().getNameColumnKeyword_0_1_0()); 
            // InternalUi23.g:4156:3: ( 'column' )
            // InternalUi23.g:4157:4: 'column'
            {
             before(grammarAccess.getLayoutAccess().getNameColumnKeyword_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getNameColumnKeyword_0_1_0()); 

            }

             after(grammarAccess.getLayoutAccess().getNameColumnKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Layout__NameAssignment_0_1"


    // $ANTLR start "rule__Layout__ComponentsAssignment_2"
    // InternalUi23.g:4168:1: rule__Layout__ComponentsAssignment_2 : ( ruleComponent ) ;
    public final void rule__Layout__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4172:1: ( ( ruleComponent ) )
            // InternalUi23.g:4173:2: ( ruleComponent )
            {
            // InternalUi23.g:4173:2: ( ruleComponent )
            // InternalUi23.g:4174:3: ruleComponent
            {
             before(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Layout__ComponentsAssignment_2"


    // $ANTLR start "rule__Label__ExpressionAssignment_2"
    // InternalUi23.g:4183:1: rule__Label__ExpressionAssignment_2 : ( ruleExp ) ;
    public final void rule__Label__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4187:1: ( ( ruleExp ) )
            // InternalUi23.g:4188:2: ( ruleExp )
            {
            // InternalUi23.g:4188:2: ( ruleExp )
            // InternalUi23.g:4189:3: ruleExp
            {
             before(grammarAccess.getLabelAccess().getExpressionExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getExpressionExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Label__ExpressionAssignment_2"


    // $ANTLR start "rule__InputText__NameAssignment_1"
    // InternalUi23.g:4198:1: rule__InputText__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputText__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4202:1: ( ( RULE_ID ) )
            // InternalUi23.g:4203:2: ( RULE_ID )
            {
            // InternalUi23.g:4203:2: ( RULE_ID )
            // InternalUi23.g:4204:3: RULE_ID
            {
             before(grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InputText__NameAssignment_1"


    // $ANTLR start "rule__InputText__ExpressionAssignment_3"
    // InternalUi23.g:4213:1: rule__InputText__ExpressionAssignment_3 : ( ruleExp ) ;
    public final void rule__InputText__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4217:1: ( ( ruleExp ) )
            // InternalUi23.g:4218:2: ( ruleExp )
            {
            // InternalUi23.g:4218:2: ( ruleExp )
            // InternalUi23.g:4219:3: ruleExp
            {
             before(grammarAccess.getInputTextAccess().getExpressionExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getInputTextAccess().getExpressionExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InputText__ExpressionAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalUi23.g:4228:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4232:1: ( ( RULE_ID ) )
            // InternalUi23.g:4233:2: ( RULE_ID )
            {
            // InternalUi23.g:4233:2: ( RULE_ID )
            // InternalUi23.g:4234:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_2"


    // $ANTLR start "rule__Button__ExpressionAssignment_4"
    // InternalUi23.g:4243:1: rule__Button__ExpressionAssignment_4 : ( ruleExp ) ;
    public final void rule__Button__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4247:1: ( ( ruleExp ) )
            // InternalUi23.g:4248:2: ( ruleExp )
            {
            // InternalUi23.g:4248:2: ( ruleExp )
            // InternalUi23.g:4249:3: ruleExp
            {
             before(grammarAccess.getButtonAccess().getExpressionExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getExpressionExpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Button__ExpressionAssignment_4"


    // $ANTLR start "rule__FormUse__NameAssignment_0"
    // InternalUi23.g:4258:1: rule__FormUse__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FormUse__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4262:1: ( ( RULE_ID ) )
            // InternalUi23.g:4263:2: ( RULE_ID )
            {
            // InternalUi23.g:4263:2: ( RULE_ID )
            // InternalUi23.g:4264:3: RULE_ID
            {
             before(grammarAccess.getFormUseAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormUse__NameAssignment_0"


    // $ANTLR start "rule__FormUse__ExpressionsAssignment_2_0"
    // InternalUi23.g:4273:1: rule__FormUse__ExpressionsAssignment_2_0 : ( ruleExp ) ;
    public final void rule__FormUse__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4277:1: ( ( ruleExp ) )
            // InternalUi23.g:4278:2: ( ruleExp )
            {
            // InternalUi23.g:4278:2: ( ruleExp )
            // InternalUi23.g:4279:3: ruleExp
            {
             before(grammarAccess.getFormUseAccess().getExpressionsExpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getFormUseAccess().getExpressionsExpParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__FormUse__ExpressionsAssignment_2_0"


    // $ANTLR start "rule__FormUse__ExpressionsAssignment_2_1_1"
    // InternalUi23.g:4288:1: rule__FormUse__ExpressionsAssignment_2_1_1 : ( ruleExp ) ;
    public final void rule__FormUse__ExpressionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4292:1: ( ( ruleExp ) )
            // InternalUi23.g:4293:2: ( ruleExp )
            {
            // InternalUi23.g:4293:2: ( ruleExp )
            // InternalUi23.g:4294:3: ruleExp
            {
             before(grammarAccess.getFormUseAccess().getExpressionsExpParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getFormUseAccess().getExpressionsExpParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__FormUse__ExpressionsAssignment_2_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalUi23.g:4303:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4307:1: ( ( RULE_ID ) )
            // InternalUi23.g:4308:2: ( RULE_ID )
            {
            // InternalUi23.g:4308:2: ( RULE_ID )
            // InternalUi23.g:4309:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalUi23.g:4318:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4322:1: ( ( ruleType ) )
            // InternalUi23.g:4323:2: ( ruleType )
            {
            // InternalUi23.g:4323:2: ( ruleType )
            // InternalUi23.g:4324:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalUi23.g:4333:1: rule__Exp__RightAssignment_1_1 : ( ruleEquality ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4337:1: ( ( ruleEquality ) )
            // InternalUi23.g:4338:2: ( ruleEquality )
            {
            // InternalUi23.g:4338:2: ( ruleEquality )
            // InternalUi23.g:4339:3: ruleEquality
            {
             before(grammarAccess.getExpAccess().getRightEqualityParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightEqualityParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_1"
    // InternalUi23.g:4348:1: rule__Equality__RightAssignment_1_1 : ( ruleCompare ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4352:1: ( ( ruleCompare ) )
            // InternalUi23.g:4353:2: ( ruleCompare )
            {
            // InternalUi23.g:4353:2: ( ruleCompare )
            // InternalUi23.g:4354:3: ruleCompare
            {
             before(grammarAccess.getEqualityAccess().getRightCompareParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightCompareParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_1"


    // $ANTLR start "rule__Compare__RightAssignment_1_1"
    // InternalUi23.g:4363:1: rule__Compare__RightAssignment_1_1 : ( ruleConcat ) ;
    public final void rule__Compare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4367:1: ( ( ruleConcat ) )
            // InternalUi23.g:4368:2: ( ruleConcat )
            {
            // InternalUi23.g:4368:2: ( ruleConcat )
            // InternalUi23.g:4369:3: ruleConcat
            {
             before(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Compare__RightAssignment_1_1"


    // $ANTLR start "rule__Concat__RightAssignment_1_1"
    // InternalUi23.g:4378:1: rule__Concat__RightAssignment_1_1 : ( ruleAddMinus ) ;
    public final void rule__Concat__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4382:1: ( ( ruleAddMinus ) )
            // InternalUi23.g:4383:2: ( ruleAddMinus )
            {
            // InternalUi23.g:4383:2: ( ruleAddMinus )
            // InternalUi23.g:4384:3: ruleAddMinus
            {
             before(grammarAccess.getConcatAccess().getRightAddMinusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddMinus();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getRightAddMinusParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Concat__RightAssignment_1_1"


    // $ANTLR start "rule__AddMinus__RightAssignment_1_1"
    // InternalUi23.g:4393:1: rule__AddMinus__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__AddMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4397:1: ( ( ruleFactor ) )
            // InternalUi23.g:4398:2: ( ruleFactor )
            {
            // InternalUi23.g:4398:2: ( ruleFactor )
            // InternalUi23.g:4399:3: ruleFactor
            {
             before(grammarAccess.getAddMinusAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getAddMinusAccess().getRightFactorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AddMinus__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalUi23.g:4408:1: rule__Factor__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4412:1: ( ( rulePrimary ) )
            // InternalUi23.g:4413:2: ( rulePrimary )
            {
            // InternalUi23.g:4413:2: ( rulePrimary )
            // InternalUi23.g:4414:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalUi23.g:4423:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4427:1: ( ( RULE_INT ) )
            // InternalUi23.g:4428:2: ( RULE_INT )
            {
            // InternalUi23.g:4428:2: ( RULE_INT )
            // InternalUi23.g:4429:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__ValueAssignment_1_1"
    // InternalUi23.g:4438:1: rule__Primary__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Primary__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi23.g:4442:1: ( ( RULE_STRING ) )
            // InternalUi23.g:4443:2: ( RULE_STRING )
            {
            // InternalUi23.g:4443:2: ( RULE_STRING )
            // InternalUi23.g:4444:3: RULE_STRING
            {
             before(grammarAccess.getPrimaryAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018000780010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000700012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007002060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007006060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000800002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004000L});

}