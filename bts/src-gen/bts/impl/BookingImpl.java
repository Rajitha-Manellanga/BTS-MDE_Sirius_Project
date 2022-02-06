/**
 */
package bts.impl;

import bts.Baggage;
import bts.Booking;
import bts.BtsPackage;
import bts.Passenger;
import bts.Payment;
import bts.Ticket;
import bts.booking_status;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.BookingImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPayment_date <em>Payment date</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getJourney_date <em>Journey date</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getTicket <em>Ticket</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getBaggage <em>Baggage</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getTotalAvailableBookings <em>Total Available Bookings</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getAllowedBags <em>Allowed Bags</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPassenger <em>Passenger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected String booking_id = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment_date() <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_date() <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_date()
	 * @generated
	 * @ordered
	 */
	protected Date payment_date = PAYMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final booking_status STATUS_EDEFAULT = booking_status.BOOKED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected booking_status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourney_date() <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourney_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOURNEY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourney_date() <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourney_date()
	 * @generated
	 * @ordered
	 */
	protected Date journey_date = JOURNEY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTicket() <em>Ticket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket()
	 * @generated
	 * @ordered
	 */
	protected Ticket ticket;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payment;

	/**
	 * The cached value of the '{@link #getBaggage() <em>Baggage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage()
	 * @generated
	 * @ordered
	 */
	protected EList<Baggage> baggage;

	/**
	 * The default value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumWeight = MAXIMUM_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAvailableBookings() <em>Total Available Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAvailableBookings()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_AVAILABLE_BOOKINGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalAvailableBookings() <em>Total Available Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAvailableBookings()
	 * @generated
	 * @ordered
	 */
	protected int totalAvailableBookings = TOTAL_AVAILABLE_BOOKINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedBags() <em>Allowed Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALLOWED_BAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedBags() <em>Allowed Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBags()
	 * @generated
	 * @ordered
	 */
	protected Integer allowedBags = ALLOWED_BAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passenger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBooking_id() {
		return booking_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooking_id(String newBooking_id) {
		String oldBooking_id = booking_id;
		booking_id = newBooking_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__BOOKING_ID, oldBooking_id,
					booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPayment_date() {
		return payment_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_date(Date newPayment_date) {
		Date oldPayment_date = payment_date;
		payment_date = newPayment_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__PAYMENT_DATE, oldPayment_date,
					payment_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public booking_status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(booking_status newStatus) {
		booking_status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJourney_date() {
		return journey_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJourney_date(Date newJourney_date) {
		Date oldJourney_date = journey_date;
		journey_date = newJourney_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__JOURNEY_DATE, oldJourney_date,
					journey_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTicket(Ticket newTicket, NotificationChain msgs) {
		Ticket oldTicket = ticket;
		ticket = newTicket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__TICKET,
					oldTicket, newTicket);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicket(Ticket newTicket) {
		if (newTicket != ticket) {
			NotificationChain msgs = null;
			if (ticket != null)
				msgs = ((InternalEObject) ticket).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BtsPackage.BOOKING__TICKET, null, msgs);
			if (newTicket != null)
				msgs = ((InternalEObject) newTicket).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BtsPackage.BOOKING__TICKET, null, msgs);
			msgs = basicSetTicket(newTicket, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__TICKET, newTicket, newTicket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectContainmentEList<Payment>(Payment.class, this, BtsPackage.BOOKING__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Baggage> getBaggage() {
		if (baggage == null) {
			baggage = new EObjectContainmentEList<Baggage>(Baggage.class, this, BtsPackage.BOOKING__BAGGAGE);
		}
		return baggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumWeight(Integer newMaximumWeight) {
		Integer oldMaximumWeight = maximumWeight;
		maximumWeight = newMaximumWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__MAXIMUM_WEIGHT, oldMaximumWeight,
					maximumWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalAvailableBookings() {
		return totalAvailableBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAvailableBookings(int newTotalAvailableBookings) {
		int oldTotalAvailableBookings = totalAvailableBookings;
		totalAvailableBookings = newTotalAvailableBookings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS,
					oldTotalAvailableBookings, totalAvailableBookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAllowedBags() {
		return allowedBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedBags(Integer newAllowedBags) {
		Integer oldAllowedBags = allowedBags;
		allowedBags = newAllowedBags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.BOOKING__ALLOWED_BAGS, oldAllowedBags,
					allowedBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Passenger> getPassenger() {
		if (passenger == null) {
			passenger = new EObjectContainmentEList<Passenger>(Passenger.class, this, BtsPackage.BOOKING__PASSENGER);
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BtsPackage.BOOKING__TICKET:
			return basicSetTicket(null, msgs);
		case BtsPackage.BOOKING__PAYMENT:
			return ((InternalEList<?>) getPayment()).basicRemove(otherEnd, msgs);
		case BtsPackage.BOOKING__BAGGAGE:
			return ((InternalEList<?>) getBaggage()).basicRemove(otherEnd, msgs);
		case BtsPackage.BOOKING__PASSENGER:
			return ((InternalEList<?>) getPassenger()).basicRemove(otherEnd, msgs);
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
		case BtsPackage.BOOKING__BOOKING_ID:
			return getBooking_id();
		case BtsPackage.BOOKING__PAYMENT_DATE:
			return getPayment_date();
		case BtsPackage.BOOKING__STATUS:
			return getStatus();
		case BtsPackage.BOOKING__JOURNEY_DATE:
			return getJourney_date();
		case BtsPackage.BOOKING__TICKET:
			return getTicket();
		case BtsPackage.BOOKING__PAYMENT:
			return getPayment();
		case BtsPackage.BOOKING__BAGGAGE:
			return getBaggage();
		case BtsPackage.BOOKING__MAXIMUM_WEIGHT:
			return getMaximumWeight();
		case BtsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
			return getTotalAvailableBookings();
		case BtsPackage.BOOKING__ALLOWED_BAGS:
			return getAllowedBags();
		case BtsPackage.BOOKING__PASSENGER:
			return getPassenger();
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
		case BtsPackage.BOOKING__BOOKING_ID:
			setBooking_id((String) newValue);
			return;
		case BtsPackage.BOOKING__PAYMENT_DATE:
			setPayment_date((Date) newValue);
			return;
		case BtsPackage.BOOKING__STATUS:
			setStatus((booking_status) newValue);
			return;
		case BtsPackage.BOOKING__JOURNEY_DATE:
			setJourney_date((Date) newValue);
			return;
		case BtsPackage.BOOKING__TICKET:
			setTicket((Ticket) newValue);
			return;
		case BtsPackage.BOOKING__PAYMENT:
			getPayment().clear();
			getPayment().addAll((Collection<? extends Payment>) newValue);
			return;
		case BtsPackage.BOOKING__BAGGAGE:
			getBaggage().clear();
			getBaggage().addAll((Collection<? extends Baggage>) newValue);
			return;
		case BtsPackage.BOOKING__MAXIMUM_WEIGHT:
			setMaximumWeight((Integer) newValue);
			return;
		case BtsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
			setTotalAvailableBookings((Integer) newValue);
			return;
		case BtsPackage.BOOKING__ALLOWED_BAGS:
			setAllowedBags((Integer) newValue);
			return;
		case BtsPackage.BOOKING__PASSENGER:
			getPassenger().clear();
			getPassenger().addAll((Collection<? extends Passenger>) newValue);
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
		case BtsPackage.BOOKING__BOOKING_ID:
			setBooking_id(BOOKING_ID_EDEFAULT);
			return;
		case BtsPackage.BOOKING__PAYMENT_DATE:
			setPayment_date(PAYMENT_DATE_EDEFAULT);
			return;
		case BtsPackage.BOOKING__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case BtsPackage.BOOKING__JOURNEY_DATE:
			setJourney_date(JOURNEY_DATE_EDEFAULT);
			return;
		case BtsPackage.BOOKING__TICKET:
			setTicket((Ticket) null);
			return;
		case BtsPackage.BOOKING__PAYMENT:
			getPayment().clear();
			return;
		case BtsPackage.BOOKING__BAGGAGE:
			getBaggage().clear();
			return;
		case BtsPackage.BOOKING__MAXIMUM_WEIGHT:
			setMaximumWeight(MAXIMUM_WEIGHT_EDEFAULT);
			return;
		case BtsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
			setTotalAvailableBookings(TOTAL_AVAILABLE_BOOKINGS_EDEFAULT);
			return;
		case BtsPackage.BOOKING__ALLOWED_BAGS:
			setAllowedBags(ALLOWED_BAGS_EDEFAULT);
			return;
		case BtsPackage.BOOKING__PASSENGER:
			getPassenger().clear();
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
		case BtsPackage.BOOKING__BOOKING_ID:
			return BOOKING_ID_EDEFAULT == null ? booking_id != null : !BOOKING_ID_EDEFAULT.equals(booking_id);
		case BtsPackage.BOOKING__PAYMENT_DATE:
			return PAYMENT_DATE_EDEFAULT == null ? payment_date != null : !PAYMENT_DATE_EDEFAULT.equals(payment_date);
		case BtsPackage.BOOKING__STATUS:
			return status != STATUS_EDEFAULT;
		case BtsPackage.BOOKING__JOURNEY_DATE:
			return JOURNEY_DATE_EDEFAULT == null ? journey_date != null : !JOURNEY_DATE_EDEFAULT.equals(journey_date);
		case BtsPackage.BOOKING__TICKET:
			return ticket != null;
		case BtsPackage.BOOKING__PAYMENT:
			return payment != null && !payment.isEmpty();
		case BtsPackage.BOOKING__BAGGAGE:
			return baggage != null && !baggage.isEmpty();
		case BtsPackage.BOOKING__MAXIMUM_WEIGHT:
			return MAXIMUM_WEIGHT_EDEFAULT == null ? maximumWeight != null
					: !MAXIMUM_WEIGHT_EDEFAULT.equals(maximumWeight);
		case BtsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
			return totalAvailableBookings != TOTAL_AVAILABLE_BOOKINGS_EDEFAULT;
		case BtsPackage.BOOKING__ALLOWED_BAGS:
			return ALLOWED_BAGS_EDEFAULT == null ? allowedBags != null : !ALLOWED_BAGS_EDEFAULT.equals(allowedBags);
		case BtsPackage.BOOKING__PASSENGER:
			return passenger != null && !passenger.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (booking_id: ");
		result.append(booking_id);
		result.append(", payment_date: ");
		result.append(payment_date);
		result.append(", status: ");
		result.append(status);
		result.append(", journey_date: ");
		result.append(journey_date);
		result.append(", maximumWeight: ");
		result.append(maximumWeight);
		result.append(", totalAvailableBookings: ");
		result.append(totalAvailableBookings);
		result.append(", allowedBags: ");
		result.append(allowedBags);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
