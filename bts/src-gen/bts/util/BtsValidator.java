/**
 */
package bts.util;

import bts.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see bts.BtsPackage
 * @generated
 */
public class BtsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BtsValidator INSTANCE = new BtsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "bts";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return BtsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case BtsPackage.CITY:
			return validateCity((City) value, diagnostics, context);
		case BtsPackage.SEAT:
			return validateSeat((Seat) value, diagnostics, context);
		case BtsPackage.TICKET:
			return validateTicket((Ticket) value, diagnostics, context);
		case BtsPackage.BOOKING:
			return validateBooking((Booking) value, diagnostics, context);
		case BtsPackage.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case BtsPackage.BAGGAGE:
			return validateBaggage((Baggage) value, diagnostics, context);
		case BtsPackage.PASSENGER:
			return validatePassenger((Passenger) value, diagnostics, context);
		case BtsPackage.KIOSK:
			return validateKIOSK((KIOSK) value, diagnostics, context);
		case BtsPackage.ONLINE_PAYMENT:
			return validateOnline_payment((Online_payment) value, diagnostics, context);
		case BtsPackage.BUS:
			return validateBus((Bus) value, diagnostics, context);
		case BtsPackage.POINT:
			return validatepoint((point) value, diagnostics, context);
		case BtsPackage.PAYMENT_METHOD:
			return validatePayment_method((Payment_method) value, diagnostics, context);
		case BtsPackage.BOOKING_STATUS:
			return validatebooking_status((booking_status) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(city, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicket(Ticket ticket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ticket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking(Booking booking, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booking, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooking_baggageweight(booking, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBooking_bagAllowance(booking, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the baggageweight constraint of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOKING__BAGGAGEWEIGHT__EEXPRESSION = "baggage.weight->select(baggage.Booking=self)-> size() <= maximumWeight";

	/**
	 * Validates the baggageweight constraint of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking_baggageweight(Booking booking, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(BtsPackage.Literals.BOOKING, booking, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "baggageweight", BOOKING__BAGGAGEWEIGHT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the bagAllowance constraint of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOKING__BAG_ALLOWANCE__EEXPRESSION = "baggage.totalBags->select(baggage.Booking=self)-> size() <= allowedBags";

	/**
	 * Validates the bagAllowance constraint of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking_bagAllowance(Booking booking, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(BtsPackage.Literals.BOOKING, booking, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "bagAllowance", BOOKING__BAG_ALLOWANCE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaggage(Baggage baggage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baggage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassenger(Passenger passenger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passenger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKIOSK(KIOSK kiosk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kiosk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnline_payment(Online_payment online_payment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(online_payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepoint(point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment_method(Payment_method payment_method, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatebooking_status(booking_status booking_status, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BtsValidator
