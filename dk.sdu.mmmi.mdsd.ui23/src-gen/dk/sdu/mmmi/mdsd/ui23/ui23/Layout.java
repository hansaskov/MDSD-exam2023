/**
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.ui23;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui23.ui23.Layout#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.ui23.ui23.Ui23Package#getLayout()
 * @model
 * @generated
 */
public interface Layout extends Component
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.ui23.ui23.Component}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.ui23.ui23.Ui23Package#getLayout_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Layout
