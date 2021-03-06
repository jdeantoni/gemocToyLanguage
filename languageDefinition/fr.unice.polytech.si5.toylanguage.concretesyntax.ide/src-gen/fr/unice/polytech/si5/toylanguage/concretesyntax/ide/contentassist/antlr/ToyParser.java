/*
 * generated by Xtext 2.23.0
 */
package fr.unice.polytech.si5.toylanguage.concretesyntax.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.si5.toylanguage.concretesyntax.ide.contentassist.antlr.internal.InternalToyParser;
import fr.unice.polytech.si5.toylanguage.concretesyntax.services.ToyGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ToyParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ToyGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ToyGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getAssignmentAccess().getAlternatives_1(), "rule__Assignment__Alternatives_1");
			builder.put(grammarAccess.getVarTypeAccess().getAlternatives(), "rule__VarType__Alternatives");
			builder.put(grammarAccess.getToyProgramAccess().getGroup(), "rule__ToyProgram__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_0(), "rule__Addition__Group_0__0");
			builder.put(grammarAccess.getSoustractionAccess().getGroup(), "rule__Soustraction__Group__0");
			builder.put(grammarAccess.getSoustractionAccess().getGroup_0(), "rule__Soustraction__Group_0__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_0(), "rule__Assignment__Group_0__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_1_0(), "rule__Assignment__Group_1_0__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_1_1(), "rule__Assignment__Group_1_1__0");
			builder.put(grammarAccess.getParallelAssignmentAccess().getGroup(), "rule__ParallelAssignment__Group__0");
			builder.put(grammarAccess.getParallelAssignmentAccess().getGroup_0(), "rule__ParallelAssignment__Group_0__0");
			builder.put(grammarAccess.getParallelAssignmentAccess().getGroup_1(), "rule__ParallelAssignment__Group_1__0");
			builder.put(grammarAccess.getParallelAssignmentAccess().getGroup_1_2(), "rule__ParallelAssignment__Group_1_2__0");
			builder.put(grammarAccess.getToyProgramAccess().getNameAssignment_2(), "rule__ToyProgram__NameAssignment_2");
			builder.put(grammarAccess.getToyProgramAccess().getOwnedVariablesAssignment_3(), "rule__ToyProgram__OwnedVariablesAssignment_3");
			builder.put(grammarAccess.getToyProgramAccess().getOwnedStatementsAssignment_4(), "rule__ToyProgram__OwnedStatementsAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_2(), "rule__Variable__NameAssignment_2");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_4(), "rule__Variable__TypeAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getInitialValueAssignment_6(), "rule__Variable__InitialValueAssignment_6");
			builder.put(grammarAccess.getAdditionAccess().getNameAssignment_0_0(), "rule__Addition__NameAssignment_0_0");
			builder.put(grammarAccess.getAdditionAccess().getLeftVariableAssignment_2(), "rule__Addition__LeftVariableAssignment_2");
			builder.put(grammarAccess.getAdditionAccess().getRightVariableAssignment_4(), "rule__Addition__RightVariableAssignment_4");
			builder.put(grammarAccess.getSoustractionAccess().getNameAssignment_0_0(), "rule__Soustraction__NameAssignment_0_0");
			builder.put(grammarAccess.getSoustractionAccess().getLeftVariableAssignment_2(), "rule__Soustraction__LeftVariableAssignment_2");
			builder.put(grammarAccess.getSoustractionAccess().getRightVariableAssignment_4(), "rule__Soustraction__RightVariableAssignment_4");
			builder.put(grammarAccess.getAssignmentAccess().getNameAssignment_0_0(), "rule__Assignment__NameAssignment_0_0");
			builder.put(grammarAccess.getAssignmentAccess().getVariableAssignment_1_0_1(), "rule__Assignment__VariableAssignment_1_0_1");
			builder.put(grammarAccess.getAssignmentAccess().getOperationAssignment_1_0_3(), "rule__Assignment__OperationAssignment_1_0_3");
			builder.put(grammarAccess.getAssignmentAccess().getVariableAssignment_1_1_0(), "rule__Assignment__VariableAssignment_1_1_0");
			builder.put(grammarAccess.getAssignmentAccess().getOperationAssignment_1_1_2(), "rule__Assignment__OperationAssignment_1_1_2");
			builder.put(grammarAccess.getParallelAssignmentAccess().getNameAssignment_0_0(), "rule__ParallelAssignment__NameAssignment_0_0");
			builder.put(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_1(), "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_1");
			builder.put(grammarAccess.getParallelAssignmentAccess().getOwnedAssignmentsAssignment_1_2_1(), "rule__ParallelAssignment__OwnedAssignmentsAssignment_1_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ToyGrammarAccess grammarAccess;

	@Override
	protected InternalToyParser createParser() {
		InternalToyParser result = new InternalToyParser(null);
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

	public ToyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ToyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
