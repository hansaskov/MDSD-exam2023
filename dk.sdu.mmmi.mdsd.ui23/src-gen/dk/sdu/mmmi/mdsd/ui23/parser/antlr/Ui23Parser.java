/*
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.parser.antlr;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.ui23.parser.antlr.internal.InternalUi23Parser;
import dk.sdu.mmmi.mdsd.ui23.services.Ui23GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Ui23Parser extends AbstractAntlrParser {

	@Inject
	private Ui23GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUi23Parser createParser(XtextTokenStream stream) {
		return new InternalUi23Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UI";
	}

	public Ui23GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Ui23GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}