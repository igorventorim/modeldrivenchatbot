/**
 */
package br.ufes.inf.mdc.mdc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdc.mdc.State#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.State#getMessages <em>Messages</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.State#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.mdc.mdc.MdcPackage#getState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.mdc.mdc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' attribute list.
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getState_Messages()
	 * @model
	 * @generated
	 */
	EList<String> getMessages();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute list.
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getState_Input()
	 * @model
	 * @generated
	 */
	EList<String> getInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList entryPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sincMessages();

} // State
