/**
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.ui23;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui23.ui23.Function#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui23.ui23.Function#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.ui23.ui23.Ui23Package#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.ui23.ui23.Ui23Package#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ui23.ui23.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.ui23.ui23.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.ui23.ui23.Ui23Package#getFunction_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // Function
