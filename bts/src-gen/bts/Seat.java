/**
 */
package bts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Seat#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.Seat#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @see bts.BtsPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
	/**
	 * Returns the value of the '<em><b>Seat id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat id</em>' attribute.
	 * @see #setSeat_id(String)
	 * @see bts.BtsPackage#getSeat_Seat_id()
	 * @model
	 * @generated
	 */
	String getSeat_id();

	/**
	 * Sets the value of the '{@link bts.Seat#getSeat_id <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat id</em>' attribute.
	 * @see #getSeat_id()
	 * @generated
	 */
	void setSeat_id(String value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' containment reference.
	 * @see #setBooking(Booking)
	 * @see bts.BtsPackage#getSeat_Booking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link bts.Seat#getBooking <em>Booking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' containment reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

} // Seat
