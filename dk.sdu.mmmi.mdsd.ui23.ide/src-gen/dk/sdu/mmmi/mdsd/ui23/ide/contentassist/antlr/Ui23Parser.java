/*
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ui23.ide.contentassist.antlr.internal.InternalUi23Parser;
import dk.sdu.mmmi.mdsd.ui23.services.Ui23GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class Ui23Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Ui23GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Ui23GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLayoutAccess().getAlternatives_0(), "rule__Layout__Alternatives_0");
			builder.put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getEqualityAccess().getAlternatives_1_0(), "rule__Equality__Alternatives_1_0");
			builder.put(grammarAccess.getCompareAccess().getAlternatives_1_0(), "rule__Compare__Alternatives_1_0");
			builder.put(grammarAccess.getAddMinusAccess().getAlternatives_1_0(), "rule__AddMinus__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getUIAccess().getGroup(), "rule__UI__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2(), "rule__Form__Group_2__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2_1(), "rule__Form__Group_2_1__0");
			builder.put(grammarAccess.getFormAccess().getGroup_2_1_1(), "rule__Form__Group_2_1_1__0");
			builder.put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getInputTextAccess().getGroup(), "rule__InputText__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup(), "rule__FormUse__Group__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup_2(), "rule__FormUse__Group_2__0");
			builder.put(grammarAccess.getFormUseAccess().getGroup_2_1(), "rule__FormUse__Group_2_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0_0(), "rule__Equality__Group_1_0_0__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0_1(), "rule__Equality__Group_1_0_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup(), "rule__Compare__Group__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1(), "rule__Compare__Group_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_0(), "rule__Compare__Group_1_0_0__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_1(), "rule__Compare__Group_1_0_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_2(), "rule__Compare__Group_1_0_2__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_3(), "rule__Compare__Group_1_0_3__0");
			builder.put(grammarAccess.getConcatAccess().getGroup(), "rule__Concat__Group__0");
			builder.put(grammarAccess.getConcatAccess().getGroup_1(), "rule__Concat__Group_1__0");
			builder.put(grammarAccess.getConcatAccess().getGroup_1_0(), "rule__Concat__Group_1_0__0");
			builder.put(grammarAccess.getAddMinusAccess().getGroup(), "rule__AddMinus__Group__0");
			builder.put(grammarAccess.getAddMinusAccess().getGroup_1(), "rule__AddMinus__Group_1__0");
			builder.put(grammarAccess.getAddMinusAccess().getGroup_1_0_0(), "rule__AddMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getAddMinusAccess().getGroup_1_0_1(), "rule__AddMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getUIAccess().getTitleAssignment_1(), "rule__UI__TitleAssignment_1");
			builder.put(grammarAccess.getUIAccess().getFunctionsAssignment_2(), "rule__UI__FunctionsAssignment_2");
			builder.put(grammarAccess.getUIAccess().getFormsAssignment_3(), "rule__UI__FormsAssignment_3");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_0(), "rule__Function__TypesAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1(), "rule__Function__TypesAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getTypesAssignment_6(), "rule__Function__TypesAssignment_6");
			builder.put(grammarAccess.getFormAccess().getNameAssignment_1(), "rule__Form__NameAssignment_1");
			builder.put(grammarAccess.getFormAccess().getParametersAssignment_2_1_0(), "rule__Form__ParametersAssignment_2_1_0");
			builder.put(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1(), "rule__Form__ParametersAssignment_2_1_1_1");
			builder.put(grammarAccess.getFormAccess().getLayoutAssignment_4(), "rule__Form__LayoutAssignment_4");
			builder.put(grammarAccess.getLayoutAccess().getNameAssignment_0_0(), "rule__Layout__NameAssignment_0_0");
			builder.put(grammarAccess.getLayoutAccess().getNameAssignment_0_1(), "rule__Layout__NameAssignment_0_1");
			builder.put(grammarAccess.getLayoutAccess().getComponentsAssignment_2(), "rule__Layout__ComponentsAssignment_2");
			builder.put(grammarAccess.getLabelAccess().getExpressionAssignment_2(), "rule__Label__ExpressionAssignment_2");
			builder.put(grammarAccess.getInputTextAccess().getNameAssignment_1(), "rule__InputText__NameAssignment_1");
			builder.put(grammarAccess.getInputTextAccess().getExpressionAssignment_3(), "rule__InputText__ExpressionAssignment_3");
			builder.put(grammarAccess.getButtonAccess().getNameAssignment_2(), "rule__Button__NameAssignment_2");
			builder.put(grammarAccess.getButtonAccess().getExpressionAssignment_4(), "rule__Button__ExpressionAssignment_4");
			builder.put(grammarAccess.getFormUseAccess().getNameAssignment_0(), "rule__FormUse__NameAssignment_0");
			builder.put(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_0(), "rule__FormUse__ExpressionsAssignment_2_0");
			builder.put(grammarAccess.getFormUseAccess().getExpressionsAssignment_2_1_1(), "rule__FormUse__ExpressionsAssignment_2_1_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_1(), "rule__Equality__RightAssignment_1_1");
			builder.put(grammarAccess.getCompareAccess().getRightAssignment_1_1(), "rule__Compare__RightAssignment_1_1");
			builder.put(grammarAccess.getConcatAccess().getRightAssignment_1_1(), "rule__Concat__RightAssignment_1_1");
			builder.put(grammarAccess.getAddMinusAccess().getRightAssignment_1_1(), "rule__AddMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_0_1(), "rule__Primary__ValueAssignment_0_1");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_1_1(), "rule__Primary__ValueAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Ui23GrammarAccess grammarAccess;

	@Override
	protected InternalUi23Parser createParser() {
		InternalUi23Parser result = new InternalUi23Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Ui23GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Ui23GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
