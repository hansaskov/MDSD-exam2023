package dk.sdu.mmmi.mdsd.ui23.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.ui23.services.Ui23GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUi23Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'function'", "'('", "','", "')'", "':'", "'form'", "'{'", "'}'", "'row'", "'column'", "'label'", "'input'", "'button'", "'*'", "'boolean'", "'string'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&'", "'+'", "'-'", "'/'"
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

        public InternalUi23Parser(TokenStream input, Ui23GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UI";
       	}

       	@Override
       	protected Ui23GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUI"
    // InternalUi23.g:64:1: entryRuleUI returns [EObject current=null] : iv_ruleUI= ruleUI EOF ;
    public final EObject entryRuleUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUI = null;


        try {
            // InternalUi23.g:64:43: (iv_ruleUI= ruleUI EOF )
            // InternalUi23.g:65:2: iv_ruleUI= ruleUI EOF
            {
             newCompositeNode(grammarAccess.getUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUI=ruleUI();

            state._fsp--;

             current =iv_ruleUI; 
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
    // $ANTLR end "entryRuleUI"


    // $ANTLR start "ruleUI"
    // InternalUi23.g:71:1: ruleUI returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* ) ;
    public final EObject ruleUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        EObject lv_functions_2_0 = null;

        EObject lv_forms_3_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:77:2: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* ) )
            // InternalUi23.g:78:2: (otherlv_0= 'title' ( (lv_title_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* )
            {
            // InternalUi23.g:78:2: (otherlv_0= 'title' ( (lv_title_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* )
            // InternalUi23.g:79:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUIAccess().getTitleKeyword_0());
            		
            // InternalUi23.g:83:3: ( (lv_title_1_0= RULE_ID ) )
            // InternalUi23.g:84:4: (lv_title_1_0= RULE_ID )
            {
            // InternalUi23.g:84:4: (lv_title_1_0= RULE_ID )
            // InternalUi23.g:85:5: lv_title_1_0= RULE_ID
            {
            lv_title_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getUIAccess().getTitleIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUi23.g:101:3: ( (lv_functions_2_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUi23.g:102:4: (lv_functions_2_0= ruleFunction )
            	    {
            	    // InternalUi23.g:102:4: (lv_functions_2_0= ruleFunction )
            	    // InternalUi23.g:103:5: lv_functions_2_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getUIAccess().getFunctionsFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_2_0,
            	    						"dk.sdu.mmmi.mdsd.ui23.Ui23.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUi23.g:120:3: ( (lv_forms_3_0= ruleForm ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUi23.g:121:4: (lv_forms_3_0= ruleForm )
            	    {
            	    // InternalUi23.g:121:4: (lv_forms_3_0= ruleForm )
            	    // InternalUi23.g:122:5: lv_forms_3_0= ruleForm
            	    {

            	    					newCompositeNode(grammarAccess.getUIAccess().getFormsFormParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_forms_3_0=ruleForm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIRule());
            	    					}
            	    					add(
            	    						current,
            	    						"forms",
            	    						lv_forms_3_0,
            	    						"dk.sdu.mmmi.mdsd.ui23.Ui23.Form");
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
    // $ANTLR end "ruleUI"


    // $ANTLR start "entryRuleFunction"
    // InternalUi23.g:143:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalUi23.g:143:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalUi23.g:144:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalUi23.g:150:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_types_8_0= ruleType ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_types_3_0 = null;

        EObject lv_types_5_0 = null;

        EObject lv_types_8_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:156:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_types_8_0= ruleType ) ) ) )
            // InternalUi23.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_types_8_0= ruleType ) ) )
            {
            // InternalUi23.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_types_8_0= ruleType ) ) )
            // InternalUi23.g:158:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_types_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalUi23.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi23.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi23.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalUi23.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUi23.g:184:3: ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=28)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUi23.g:185:4: ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    {
                    // InternalUi23.g:185:4: ( (lv_types_3_0= ruleType ) )
                    // InternalUi23.g:186:5: (lv_types_3_0= ruleType )
                    {
                    // InternalUi23.g:186:5: (lv_types_3_0= ruleType )
                    // InternalUi23.g:187:6: lv_types_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_0,
                    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUi23.g:204:4: (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUi23.g:205:5: otherlv_4= ',' ( (lv_types_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUi23.g:209:5: ( (lv_types_5_0= ruleType ) )
                    	    // InternalUi23.g:210:6: (lv_types_5_0= ruleType )
                    	    {
                    	    // InternalUi23.g:210:6: (lv_types_5_0= ruleType )
                    	    // InternalUi23.g:211:7: lv_types_5_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_5_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_5_0,
                    	    								"dk.sdu.mmmi.mdsd.ui23.Ui23.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_5());
            		
            // InternalUi23.g:238:3: ( (lv_types_8_0= ruleType ) )
            // InternalUi23.g:239:4: (lv_types_8_0= ruleType )
            {
            // InternalUi23.g:239:4: (lv_types_8_0= ruleType )
            // InternalUi23.g:240:5: lv_types_8_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_8_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_8_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleForm"
    // InternalUi23.g:261:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalUi23.g:261:45: (iv_ruleForm= ruleForm EOF )
            // InternalUi23.g:262:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalUi23.g:268:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_layout_8_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:274:2: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) )
            // InternalUi23.g:275:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            {
            // InternalUi23.g:275:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            // InternalUi23.g:276:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalUi23.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi23.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi23.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalUi23.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUi23.g:298:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUi23.g:299:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalUi23.g:303:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalUi23.g:304:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            {
                            // InternalUi23.g:304:5: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalUi23.g:305:6: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalUi23.g:305:6: (lv_parameters_3_0= ruleParameter )
                            // InternalUi23.g:306:7: lv_parameters_3_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFormRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"dk.sdu.mmmi.mdsd.ui23.Ui23.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalUi23.g:323:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==14) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalUi23.g:324:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalUi23.g:328:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalUi23.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalUi23.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalUi23.g:330:8: lv_parameters_5_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFormRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_5_0,
                            	    									"dk.sdu.mmmi.mdsd.ui23.Ui23.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUi23.g:358:3: ( (lv_layout_8_0= ruleLayout ) )
            // InternalUi23.g:359:4: (lv_layout_8_0= ruleLayout )
            {
            // InternalUi23.g:359:4: (lv_layout_8_0= ruleLayout )
            // InternalUi23.g:360:5: lv_layout_8_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_layout_8_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_8_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalUi23.g:385:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalUi23.g:385:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalUi23.g:386:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalUi23.g:392:1: ruleLayout returns [EObject current=null] : ( (otherlv_0= 'row' | otherlv_1= 'column' ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:398:2: ( ( (otherlv_0= 'row' | otherlv_1= 'column' ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // InternalUi23.g:399:2: ( (otherlv_0= 'row' | otherlv_1= 'column' ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // InternalUi23.g:399:2: ( (otherlv_0= 'row' | otherlv_1= 'column' ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // InternalUi23.g:400:3: (otherlv_0= 'row' | otherlv_1= 'column' ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            // InternalUi23.g:400:3: (otherlv_0= 'row' | otherlv_1= 'column' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUi23.g:401:4: otherlv_0= 'row'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getRowKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUi23.g:406:4: otherlv_1= 'column'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getColumnKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUi23.g:415:3: ( (lv_components_3_0= ruleComponent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=20 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUi23.g:416:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalUi23.g:416:4: (lv_components_3_0= ruleComponent )
            	    // InternalUi23.g:417:5: lv_components_3_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"dk.sdu.mmmi.mdsd.ui23.Ui23.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleComponent"
    // InternalUi23.g:442:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalUi23.g:442:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalUi23.g:443:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalUi23.g:449:1: ruleComponent returns [EObject current=null] : (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Layout_0 = null;

        EObject this_Element_1 = null;

        EObject this_FormUse_2 = null;



        	enterRule();

        try {
            // InternalUi23.g:455:2: ( (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse ) )
            // InternalUi23.g:456:2: (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse )
            {
            // InternalUi23.g:456:2: (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUi23.g:457:3: this_Layout_0= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_0=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUi23.g:466:3: this_Element_1= ruleElement
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Element_1=ruleElement();

                    state._fsp--;


                    			current = this_Element_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUi23.g:475:3: this_FormUse_2= ruleFormUse
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormUse_2=ruleFormUse();

                    state._fsp--;


                    			current = this_FormUse_2;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleElement"
    // InternalUi23.g:487:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUi23.g:487:48: (iv_ruleElement= ruleElement EOF )
            // InternalUi23.g:488:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUi23.g:494:1: ruleElement returns [EObject current=null] : (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_InputText_1 = null;

        EObject this_Button_2 = null;



        	enterRule();

        try {
            // InternalUi23.g:500:2: ( (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton ) )
            // InternalUi23.g:501:2: (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton )
            {
            // InternalUi23.g:501:2: (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUi23.g:502:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUi23.g:511:3: this_InputText_1= ruleInputText
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInputTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputText_1=ruleInputText();

                    state._fsp--;


                    			current = this_InputText_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUi23.g:520:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalUi23.g:532:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalUi23.g:532:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalUi23.g:533:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalUi23.g:539:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:545:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalUi23.g:546:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalUi23.g:546:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalUi23.g:547:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalUi23.g:555:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalUi23.g:556:4: (lv_exp_2_0= ruleExp )
            {
            // InternalUi23.g:556:4: (lv_exp_2_0= ruleExp )
            // InternalUi23.g:557:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInputText"
    // InternalUi23.g:578:1: entryRuleInputText returns [EObject current=null] : iv_ruleInputText= ruleInputText EOF ;
    public final EObject entryRuleInputText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputText = null;


        try {
            // InternalUi23.g:578:50: (iv_ruleInputText= ruleInputText EOF )
            // InternalUi23.g:579:2: iv_ruleInputText= ruleInputText EOF
            {
             newCompositeNode(grammarAccess.getInputTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputText=ruleInputText();

            state._fsp--;

             current =iv_ruleInputText; 
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
    // $ANTLR end "entryRuleInputText"


    // $ANTLR start "ruleInputText"
    // InternalUi23.g:585:1: ruleInputText returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleInputText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:591:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalUi23.g:592:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalUi23.g:592:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalUi23.g:593:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputTextAccess().getInputKeyword_0());
            		
            // InternalUi23.g:597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi23.g:598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi23.g:598:4: (lv_name_1_0= RULE_ID )
            // InternalUi23.g:599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInputTextAccess().getColonKeyword_2());
            		
            // InternalUi23.g:619:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalUi23.g:620:4: (lv_exp_3_0= ruleExp )
            {
            // InternalUi23.g:620:4: (lv_exp_3_0= ruleExp )
            // InternalUi23.g:621:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getInputTextAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputTextRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleInputText"


    // $ANTLR start "entryRuleButton"
    // InternalUi23.g:642:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalUi23.g:642:47: (iv_ruleButton= ruleButton EOF )
            // InternalUi23.g:643:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUi23.g:649:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' (otherlv_1= '*' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:655:2: ( (otherlv_0= 'button' (otherlv_1= '*' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) )
            // InternalUi23.g:656:2: (otherlv_0= 'button' (otherlv_1= '*' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            {
            // InternalUi23.g:656:2: (otherlv_0= 'button' (otherlv_1= '*' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            // InternalUi23.g:657:3: otherlv_0= 'button' (otherlv_1= '*' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalUi23.g:661:3: (otherlv_1= '*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUi23.g:662:4: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getAsteriskKeyword_1());
                    			

                    }
                    break;

            }

            // InternalUi23.g:667:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUi23.g:668:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUi23.g:668:4: (lv_name_2_0= RULE_ID )
            // InternalUi23.g:669:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getColonKeyword_3());
            		
            // InternalUi23.g:689:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalUi23.g:690:4: (lv_exp_4_0= ruleExp )
            {
            // InternalUi23.g:690:4: (lv_exp_4_0= ruleExp )
            // InternalUi23.g:691:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleFormUse"
    // InternalUi23.g:712:1: entryRuleFormUse returns [EObject current=null] : iv_ruleFormUse= ruleFormUse EOF ;
    public final EObject entryRuleFormUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormUse = null;


        try {
            // InternalUi23.g:712:48: (iv_ruleFormUse= ruleFormUse EOF )
            // InternalUi23.g:713:2: iv_ruleFormUse= ruleFormUse EOF
            {
             newCompositeNode(grammarAccess.getFormUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormUse=ruleFormUse();

            state._fsp--;

             current =iv_ruleFormUse; 
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
    // $ANTLR end "entryRuleFormUse"


    // $ANTLR start "ruleFormUse"
    // InternalUi23.g:719:1: ruleFormUse returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFormUse() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:725:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) )
            // InternalUi23.g:726:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            {
            // InternalUi23.g:726:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            // InternalUi23.g:727:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )? otherlv_5= ')'
            {
            // InternalUi23.g:727:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUi23.g:728:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUi23.g:728:4: (lv_name_0_0= RULE_ID )
            // InternalUi23.g:729:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFormUseAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUi23.g:749:3: ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)||LA14_0==13||(LA14_0>=26 && LA14_0<=28)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUi23.g:750:4: ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )*
                    {
                    // InternalUi23.g:750:4: ( (lv_exp_2_0= ruleExp ) )
                    // InternalUi23.g:751:5: (lv_exp_2_0= ruleExp )
                    {
                    // InternalUi23.g:751:5: (lv_exp_2_0= ruleExp )
                    // InternalUi23.g:752:6: lv_exp_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getFormUseAccess().getExpExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_exp_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormUseRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_2_0,
                    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUi23.g:769:4: (otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUi23.g:770:5: otherlv_3= ',' ( (lv_exp_4_0= ruleExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUi23.g:774:5: ( (lv_exp_4_0= ruleExp ) )
                    	    // InternalUi23.g:775:6: (lv_exp_4_0= ruleExp )
                    	    {
                    	    // InternalUi23.g:775:6: (lv_exp_4_0= ruleExp )
                    	    // InternalUi23.g:776:7: lv_exp_4_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormUseAccess().getExpExpParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_exp_4_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFormUseRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"exp",
                    	    								lv_exp_4_0,
                    	    								"dk.sdu.mmmi.mdsd.ui23.Ui23.Exp");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFormUse"


    // $ANTLR start "entryRuleParameter"
    // InternalUi23.g:803:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUi23.g:803:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUi23.g:804:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUi23.g:810:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:816:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalUi23.g:817:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalUi23.g:817:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalUi23.g:818:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalUi23.g:818:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUi23.g:819:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUi23.g:819:4: (lv_name_0_0= RULE_ID )
            // InternalUi23.g:820:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUi23.g:840:3: ( (lv_type_2_0= ruleType ) )
            // InternalUi23.g:841:4: (lv_type_2_0= ruleType )
            {
            // InternalUi23.g:841:4: (lv_type_2_0= ruleType )
            // InternalUi23.g:842:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mmmi.mdsd.ui23.Ui23.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalUi23.g:863:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUi23.g:863:45: (iv_ruleType= ruleType EOF )
            // InternalUi23.g:864:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUi23.g:870:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUi23.g:876:2: ( ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) ) )
            // InternalUi23.g:877:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) )
            {
            // InternalUi23.g:877:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUi23.g:878:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalUi23.g:878:3: ( () otherlv_1= 'boolean' )
                    // InternalUi23.g:879:4: () otherlv_1= 'boolean'
                    {
                    // InternalUi23.g:879:4: ()
                    // InternalUi23.g:880:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBoolTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:892:3: ( () otherlv_3= 'string' )
                    {
                    // InternalUi23.g:892:3: ( () otherlv_3= 'string' )
                    // InternalUi23.g:893:4: () otherlv_3= 'string'
                    {
                    // InternalUi23.g:893:4: ()
                    // InternalUi23.g:894:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStringTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getStringKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:906:3: ( () otherlv_5= 'number' )
                    {
                    // InternalUi23.g:906:3: ( () otherlv_5= 'number' )
                    // InternalUi23.g:907:4: () otherlv_5= 'number'
                    {
                    // InternalUi23.g:907:4: ()
                    // InternalUi23.g:908:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getNumberTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getNumberKeyword_2_1());
                    			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalUi23.g:923:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalUi23.g:923:44: (iv_ruleExp= ruleExp EOF )
            // InternalUi23.g:924:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalUi23.g:930:1: ruleExp returns [EObject current=null] : (this_Equality_0= ruleEquality ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Equality_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:936:2: ( (this_Equality_0= ruleEquality ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )* ) )
            // InternalUi23.g:937:2: (this_Equality_0= ruleEquality ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )* )
            {
            // InternalUi23.g:937:2: (this_Equality_0= ruleEquality ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )* )
            // InternalUi23.g:938:3: this_Equality_0= ruleEquality ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:946:3: ( ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUi23.g:947:4: ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) ) ( (lv_right_5_0= ruleEquality ) )
            	    {
            	    // InternalUi23.g:947:4: ( ( () otherlv_2= '&&' ) | ( () otherlv_4= '||' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==29) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==30) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalUi23.g:948:5: ( () otherlv_2= '&&' )
            	            {
            	            // InternalUi23.g:948:5: ( () otherlv_2= '&&' )
            	            // InternalUi23.g:949:6: () otherlv_2= '&&'
            	            {
            	            // InternalUi23.g:949:6: ()
            	            // InternalUi23.g:950:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getAndLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getAmpersandAmpersandKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUi23.g:962:5: ( () otherlv_4= '||' )
            	            {
            	            // InternalUi23.g:962:5: ( () otherlv_4= '||' )
            	            // InternalUi23.g:963:6: () otherlv_4= '||'
            	            {
            	            // InternalUi23.g:963:6: ()
            	            // InternalUi23.g:964:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getOrLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalUi23.g:976:4: ( (lv_right_5_0= ruleEquality ) )
            	    // InternalUi23.g:977:5: (lv_right_5_0= ruleEquality )
            	    {
            	    // InternalUi23.g:977:5: (lv_right_5_0= ruleEquality )
            	    // InternalUi23.g:978:6: lv_right_5_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightEqualityParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_5_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleEquality"
    // InternalUi23.g:1000:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalUi23.g:1000:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalUi23.g:1001:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalUi23.g:1007:1: ruleEquality returns [EObject current=null] : (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Compare_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:1013:2: ( (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) )
            // InternalUi23.g:1014:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            {
            // InternalUi23.g:1014:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            // InternalUi23.g:1015:3: this_Compare_0= ruleCompare ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:1023:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUi23.g:1024:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleCompare ) )
            	    {
            	    // InternalUi23.g:1024:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==31) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==32) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalUi23.g:1025:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalUi23.g:1025:5: ( () otherlv_2= '==' )
            	            // InternalUi23.g:1026:6: () otherlv_2= '=='
            	            {
            	            // InternalUi23.g:1026:6: ()
            	            // InternalUi23.g:1027:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualityAccess().getEQLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,31,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUi23.g:1039:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalUi23.g:1039:5: ( () otherlv_4= '!=' )
            	            // InternalUi23.g:1040:6: () otherlv_4= '!='
            	            {
            	            // InternalUi23.g:1040:6: ()
            	            // InternalUi23.g:1041:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualityAccess().getNEQLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalUi23.g:1053:4: ( (lv_right_5_0= ruleCompare ) )
            	    // InternalUi23.g:1054:5: (lv_right_5_0= ruleCompare )
            	    {
            	    // InternalUi23.g:1054:5: (lv_right_5_0= ruleCompare )
            	    // InternalUi23.g:1055:6: lv_right_5_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightCompareParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_5_0=ruleCompare();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Compare");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleCompare"
    // InternalUi23.g:1077:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalUi23.g:1077:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalUi23.g:1078:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalUi23.g:1084:1: ruleCompare returns [EObject current=null] : (this_Concat_0= ruleConcat ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Concat_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:1090:2: ( (this_Concat_0= ruleConcat ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )* ) )
            // InternalUi23.g:1091:2: (this_Concat_0= ruleConcat ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )* )
            {
            // InternalUi23.g:1091:2: (this_Concat_0= ruleConcat ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )* )
            // InternalUi23.g:1092:3: this_Concat_0= ruleConcat ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getConcatParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Concat_0=ruleConcat();

            state._fsp--;


            			current = this_Concat_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:1100:3: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=33 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUi23.g:1101:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) ) ( (lv_right_9_0= ruleConcat ) )
            	    {
            	    // InternalUi23.g:1101:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '>=' ) )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalUi23.g:1102:5: ( () otherlv_2= '<' )
            	            {
            	            // InternalUi23.g:1102:5: ( () otherlv_2= '<' )
            	            // InternalUi23.g:1103:6: () otherlv_2= '<'
            	            {
            	            // InternalUi23.g:1103:6: ()
            	            // InternalUi23.g:1104:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLTLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,33,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUi23.g:1116:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalUi23.g:1116:5: ( () otherlv_4= '<=' )
            	            // InternalUi23.g:1117:6: () otherlv_4= '<='
            	            {
            	            // InternalUi23.g:1117:6: ()
            	            // InternalUi23.g:1118:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLTELeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,34,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalUi23.g:1130:5: ( () otherlv_6= '>' )
            	            {
            	            // InternalUi23.g:1130:5: ( () otherlv_6= '>' )
            	            // InternalUi23.g:1131:6: () otherlv_6= '>'
            	            {
            	            // InternalUi23.g:1131:6: ()
            	            // InternalUi23.g:1132:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGTLeftAction_1_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_6=(Token)match(input,35,FOLLOW_17); 

            	            						newLeafNode(otherlv_6, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_2_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalUi23.g:1144:5: ( () otherlv_8= '>=' )
            	            {
            	            // InternalUi23.g:1144:5: ( () otherlv_8= '>=' )
            	            // InternalUi23.g:1145:6: () otherlv_8= '>='
            	            {
            	            // InternalUi23.g:1145:6: ()
            	            // InternalUi23.g:1146:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGTELeftAction_1_0_3_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_8=(Token)match(input,36,FOLLOW_17); 

            	            						newLeafNode(otherlv_8, grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalUi23.g:1158:4: ( (lv_right_9_0= ruleConcat ) )
            	    // InternalUi23.g:1159:5: (lv_right_9_0= ruleConcat )
            	    {
            	    // InternalUi23.g:1159:5: (lv_right_9_0= ruleConcat )
            	    // InternalUi23.g:1160:6: lv_right_9_0= ruleConcat
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_9_0=ruleConcat();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_9_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Concat");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleConcat"
    // InternalUi23.g:1182:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalUi23.g:1182:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalUi23.g:1183:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalUi23.g:1189:1: ruleConcat returns [EObject current=null] : (this_AddMinus_0= ruleAddMinus ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AddMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:1195:2: ( (this_AddMinus_0= ruleAddMinus ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )* ) )
            // InternalUi23.g:1196:2: (this_AddMinus_0= ruleAddMinus ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )* )
            {
            // InternalUi23.g:1196:2: (this_AddMinus_0= ruleAddMinus ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )* )
            // InternalUi23.g:1197:3: this_AddMinus_0= ruleAddMinus ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getConcatAccess().getAddMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AddMinus_0=ruleAddMinus();

            state._fsp--;


            			current = this_AddMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:1205:3: ( ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUi23.g:1206:4: ( () otherlv_2= '&' ) ( (lv_right_3_0= ruleAddMinus ) )
            	    {
            	    // InternalUi23.g:1206:4: ( () otherlv_2= '&' )
            	    // InternalUi23.g:1207:5: () otherlv_2= '&'
            	    {
            	    // InternalUi23.g:1207:5: ()
            	    // InternalUi23.g:1208:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getConcatAccess().getConcLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_17); 

            	    					newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getAmpersandKeyword_1_0_1());
            	    				

            	    }

            	    // InternalUi23.g:1219:4: ( (lv_right_3_0= ruleAddMinus ) )
            	    // InternalUi23.g:1220:5: (lv_right_3_0= ruleAddMinus )
            	    {
            	    // InternalUi23.g:1220:5: (lv_right_3_0= ruleAddMinus )
            	    // InternalUi23.g:1221:6: lv_right_3_0= ruleAddMinus
            	    {

            	    						newCompositeNode(grammarAccess.getConcatAccess().getRightAddMinusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAddMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcatRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.AddMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleAddMinus"
    // InternalUi23.g:1243:1: entryRuleAddMinus returns [EObject current=null] : iv_ruleAddMinus= ruleAddMinus EOF ;
    public final EObject entryRuleAddMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddMinus = null;


        try {
            // InternalUi23.g:1243:49: (iv_ruleAddMinus= ruleAddMinus EOF )
            // InternalUi23.g:1244:2: iv_ruleAddMinus= ruleAddMinus EOF
            {
             newCompositeNode(grammarAccess.getAddMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddMinus=ruleAddMinus();

            state._fsp--;

             current =iv_ruleAddMinus; 
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
    // $ANTLR end "entryRuleAddMinus"


    // $ANTLR start "ruleAddMinus"
    // InternalUi23.g:1250:1: ruleAddMinus returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleAddMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:1256:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalUi23.g:1257:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalUi23.g:1257:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalUi23.g:1258:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddMinusAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:1266:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUi23.g:1267:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalUi23.g:1267:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==39) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalUi23.g:1268:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalUi23.g:1268:5: ( () otherlv_2= '+' )
            	            // InternalUi23.g:1269:6: () otherlv_2= '+'
            	            {
            	            // InternalUi23.g:1269:6: ()
            	            // InternalUi23.g:1270:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAddMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAddMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUi23.g:1282:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalUi23.g:1282:5: ( () otherlv_4= '-' )
            	            // InternalUi23.g:1283:6: () otherlv_4= '-'
            	            {
            	            // InternalUi23.g:1283:6: ()
            	            // InternalUi23.g:1284:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAddMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAddMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalUi23.g:1296:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalUi23.g:1297:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalUi23.g:1297:5: (lv_right_5_0= ruleFactor )
            	    // InternalUi23.g:1298:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getAddMinusAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleAddMinus"


    // $ANTLR start "entryRuleFactor"
    // InternalUi23.g:1320:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalUi23.g:1320:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalUi23.g:1321:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalUi23.g:1327:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalUi23.g:1333:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalUi23.g:1334:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalUi23.g:1334:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalUi23.g:1335:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi23.g:1343:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25||LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUi23.g:1344:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalUi23.g:1344:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==25) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==40) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalUi23.g:1345:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalUi23.g:1345:5: ( () otherlv_2= '*' )
            	            // InternalUi23.g:1346:6: () otherlv_2= '*'
            	            {
            	            // InternalUi23.g:1346:6: ()
            	            // InternalUi23.g:1347:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUi23.g:1359:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalUi23.g:1359:5: ( () otherlv_4= '/' )
            	            // InternalUi23.g:1360:6: () otherlv_4= '/'
            	            {
            	            // InternalUi23.g:1360:6: ()
            	            // InternalUi23.g:1361:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalUi23.g:1373:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalUi23.g:1374:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalUi23.g:1374:5: (lv_right_5_0= rulePrimary )
            	    // InternalUi23.g:1375:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.ui23.Ui23.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalUi23.g:1397:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalUi23.g:1397:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalUi23.g:1398:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalUi23.g:1404:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) | this_Type_7= ruleType ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Exp_5 = null;

        EObject this_Type_7 = null;



        	enterRule();

        try {
            // InternalUi23.g:1410:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) | this_Type_7= ruleType ) )
            // InternalUi23.g:1411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) | this_Type_7= ruleType )
            {
            // InternalUi23.g:1411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) | this_Type_7= ruleType )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
                {
                alt27=2;
                }
                break;
            case 13:
                {
                alt27=3;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalUi23.g:1412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUi23.g:1412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUi23.g:1413:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUi23.g:1413:4: ()
                    // InternalUi23.g:1414:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getValueIntAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUi23.g:1420:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUi23.g:1421:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUi23.g:1421:5: (lv_value_1_0= RULE_INT )
                    // InternalUi23.g:1422:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUi23.g:1440:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalUi23.g:1440:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalUi23.g:1441:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalUi23.g:1441:4: ()
                    // InternalUi23.g:1442:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getValueStringAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUi23.g:1448:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalUi23.g:1449:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalUi23.g:1449:5: (lv_value_3_0= RULE_STRING )
                    // InternalUi23.g:1450:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getPrimaryAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUi23.g:1468:3: (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' )
                    {
                    // InternalUi23.g:1468:3: (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' )
                    // InternalUi23.g:1469:4: otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_Exp_5=ruleExp();

                    state._fsp--;


                    				current = this_Exp_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUi23.g:1487:3: this_Type_7= ruleType
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_7=ruleType();

                    state._fsp--;


                    			current = this_Type_7;
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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001C002060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C00A060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010002000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});

}