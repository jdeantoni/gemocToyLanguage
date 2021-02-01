package fr.unice.polytech.si5.toylanguage.diagram

import javax.inject.Inject

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

import static de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement
import de.cau.cs.kieler.klighd.kgraph.KLabel

class ToyProgramDiagramSynthesis extends AbstractDiagramSynthesis<ToyProgram> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    
    override KNode transform(ToyProgram model) {
        val root = model.createNode()
        //.associateWith(model);
        
         for(Statement s : model.getOwnedStatements()) {
        	val KNode node = createNode().associateWith(s);
        	root.children.add(node);
        	node.addEllipse
        	node.addOutsideBottomCenteredNodeLabel(s.getName)
        }
        
        // Your dsl element <-> diagram figure mapping goes here!!
        
        // Notice the statically imported classes 'DiagramSyntheses' and 'DiagramLayoutOptions'
        //  that contribute direct access to a couple of (layout) configurations
        
        return root;
    }
    
}
