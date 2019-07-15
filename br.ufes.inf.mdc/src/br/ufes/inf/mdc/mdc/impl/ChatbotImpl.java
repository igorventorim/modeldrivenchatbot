/**
 */
package br.ufes.inf.mdc.mdc.impl;

import br.ufes.inf.mdc.mdc.Chatbot;
import br.ufes.inf.mdc.mdc.MdcPackage;
import br.ufes.inf.mdc.mdc.Mensageiro;
import br.ufes.inf.mdc.mdc.NLUService;
import br.ufes.inf.mdc.mdc.State;

import br.ufes.inf.mdc.mdc.StationaryState;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chatbot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getToken <em>Token</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getStates <em>States</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getInitState <em>Init State</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getTokenNluService <em>Token Nlu Service</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getNluService <em>Nlu Service</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl#getMensageiro <em>Mensageiro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChatbotImpl extends MinimalEObjectImpl.Container implements Chatbot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitState() <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected StationaryState initState;

	/**
	 * The default value of the '{@link #getTokenNluService() <em>Token Nlu Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNluService()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_NLU_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenNluService() <em>Token Nlu Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNluService()
	 * @generated
	 * @ordered
	 */
	protected String tokenNluService = TOKEN_NLU_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNluService() <em>Nlu Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNluService()
	 * @generated
	 * @ordered
	 */
	protected static final NLUService NLU_SERVICE_EDEFAULT = NLUService.WIT;

	/**
	 * The cached value of the '{@link #getNluService() <em>Nlu Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNluService()
	 * @generated
	 * @ordered
	 */
	protected NLUService nluService = NLU_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMensageiro() <em>Mensageiro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensageiro()
	 * @generated
	 * @ordered
	 */
	protected static final Mensageiro MENSAGEIRO_EDEFAULT = Mensageiro.TELEGRAM;

	/**
	 * The cached value of the '{@link #getMensageiro() <em>Mensageiro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensageiro()
	 * @generated
	 * @ordered
	 */
	protected Mensageiro mensageiro = MENSAGEIRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChatbotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcPackage.Literals.CHATBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, MdcPackage.CHATBOT__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StationaryState getInitState() {
		if (initState != null && initState.eIsProxy()) {
			InternalEObject oldInitState = (InternalEObject)initState;
			initState = (StationaryState)eResolveProxy(oldInitState);
			if (initState != oldInitState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdcPackage.CHATBOT__INIT_STATE, oldInitState, initState));
			}
		}
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationaryState basicGetInitState() {
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitState(StationaryState newInitState) {
		StationaryState oldInitState = initState;
		initState = newInitState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__INIT_STATE, oldInitState, initState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenNluService() {
		return tokenNluService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenNluService(String newTokenNluService) {
		String oldTokenNluService = tokenNluService;
		tokenNluService = newTokenNluService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__TOKEN_NLU_SERVICE, oldTokenNluService, tokenNluService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NLUService getNluService() {
		return nluService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNluService(NLUService newNluService) {
		NLUService oldNluService = nluService;
		nluService = newNluService == null ? NLU_SERVICE_EDEFAULT : newNluService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__NLU_SERVICE, oldNluService, nluService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mensageiro getMensageiro() {
		return mensageiro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMensageiro(Mensageiro newMensageiro) {
		Mensageiro oldMensageiro = mensageiro;
		mensageiro = newMensageiro == null ? MENSAGEIRO_EDEFAULT : newMensageiro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.CHATBOT__MENSAGEIRO, oldMensageiro, mensageiro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdcPackage.CHATBOT__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcPackage.CHATBOT__NAME:
				return getName();
			case MdcPackage.CHATBOT__TOKEN:
				return getToken();
			case MdcPackage.CHATBOT__STATES:
				return getStates();
			case MdcPackage.CHATBOT__INIT_STATE:
				if (resolve) return getInitState();
				return basicGetInitState();
			case MdcPackage.CHATBOT__TOKEN_NLU_SERVICE:
				return getTokenNluService();
			case MdcPackage.CHATBOT__NLU_SERVICE:
				return getNluService();
			case MdcPackage.CHATBOT__MENSAGEIRO:
				return getMensageiro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdcPackage.CHATBOT__NAME:
				setName((String)newValue);
				return;
			case MdcPackage.CHATBOT__TOKEN:
				setToken((String)newValue);
				return;
			case MdcPackage.CHATBOT__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case MdcPackage.CHATBOT__INIT_STATE:
				setInitState((StationaryState)newValue);
				return;
			case MdcPackage.CHATBOT__TOKEN_NLU_SERVICE:
				setTokenNluService((String)newValue);
				return;
			case MdcPackage.CHATBOT__NLU_SERVICE:
				setNluService((NLUService)newValue);
				return;
			case MdcPackage.CHATBOT__MENSAGEIRO:
				setMensageiro((Mensageiro)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdcPackage.CHATBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdcPackage.CHATBOT__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case MdcPackage.CHATBOT__STATES:
				getStates().clear();
				return;
			case MdcPackage.CHATBOT__INIT_STATE:
				setInitState((StationaryState)null);
				return;
			case MdcPackage.CHATBOT__TOKEN_NLU_SERVICE:
				setTokenNluService(TOKEN_NLU_SERVICE_EDEFAULT);
				return;
			case MdcPackage.CHATBOT__NLU_SERVICE:
				setNluService(NLU_SERVICE_EDEFAULT);
				return;
			case MdcPackage.CHATBOT__MENSAGEIRO:
				setMensageiro(MENSAGEIRO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdcPackage.CHATBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdcPackage.CHATBOT__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case MdcPackage.CHATBOT__STATES:
				return states != null && !states.isEmpty();
			case MdcPackage.CHATBOT__INIT_STATE:
				return initState != null;
			case MdcPackage.CHATBOT__TOKEN_NLU_SERVICE:
				return TOKEN_NLU_SERVICE_EDEFAULT == null ? tokenNluService != null : !TOKEN_NLU_SERVICE_EDEFAULT.equals(tokenNluService);
			case MdcPackage.CHATBOT__NLU_SERVICE:
				return nluService != NLU_SERVICE_EDEFAULT;
			case MdcPackage.CHATBOT__MENSAGEIRO:
				return mensageiro != MENSAGEIRO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", token: ");
		result.append(token);
		result.append(", tokenNluService: ");
		result.append(tokenNluService);
		result.append(", nluService: ");
		result.append(nluService);
		result.append(", mensageiro: ");
		result.append(mensageiro);
		result.append(')');
		return result.toString();
	}

} //ChatbotImpl
