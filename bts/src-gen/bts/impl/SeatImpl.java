/**
 */
package bts.impl;

import bts.Booking;
import bts.BtsPackage;
import bts.Seat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.SeatImpl#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.impl.SeatImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
	/**
	 * The default value of the '{@link #getSeat_id() <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeat_id() <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat_id()
	 * @generated
	 * @ordered
	 */
	protected String seat_id = SEAT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeat_id() {
		return seat_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeat_id(String newSeat_id) {
		String oldSeat_id = seat_id;
		seat_id = newSeat_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.SEAT__SEAT_ID, oldSeat_id, seat_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Booking getBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooking(Booking newBooking, NotificationChain msgs) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BtsPackage.SEAT__BOOKING,
					oldBooking, newBooking);
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
	public void setBooking(Booking newBooking) {
		if (newBooking != booking) {
			NotificationChain msgs = null;
			if (booking != null)
				msgs = ((InternalEObject) booking).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BtsPackage.SEAT__BOOKING, null, msgs);
			if (newBooking != null)
				msgs = ((InternalEObject) newBooking).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BtsPackage.SEAT__BOOKING, null, msgs);
			msgs = basicSetBooking(newBooking, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsPackage.SEAT__BOOKING, newBooking, newBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BtsPackage.SEAT__BOOKING:
			return basicSetBooking(null, msgs);
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
		case BtsPackage.SEAT__SEAT_ID:
			return getSeat_id();
		case BtsPackage.SEAT__BOOKING:
			return getBooking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BtsPackage.SEAT__SEAT_ID:
			setSeat_id((String) newValue);
			return;
		case BtsPackage.SEAT__BOOKING:
			setBooking((Booking) newValue);
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
		case BtsPackage.SEAT__SEAT_ID:
			setSeat_id(SEAT_ID_EDEFAULT);
			return;
		case BtsPackage.SEAT__BOOKING:
			setBooking((Booking) null);
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
		case BtsPackage.SEAT__SEAT_ID:
			return SEAT_ID_EDEFAULT == null ? seat_id != null : !SEAT_ID_EDEFAULT.equals(seat_id);
		case BtsPackage.SEAT__BOOKING:
			return booking != null;
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
		result.append(" (seat_id: ");
		result.append(seat_id);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
