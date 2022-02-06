/**
 */
package bts.provider;

import bts.util.BtsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsItemProviderAdapterFactory extends BtsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.City} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityItemProvider cityItemProvider;

	/**
	 * This creates an adapter for a {@link bts.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCityAdapter() {
		if (cityItemProvider == null) {
			cityItemProvider = new CityItemProvider(this);
		}

		return cityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Seat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatItemProvider seatItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Seat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeatAdapter() {
		if (seatItemProvider == null) {
			seatItemProvider = new SeatItemProvider(this);
		}

		return seatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Ticket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketItemProvider ticketItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Ticket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTicketAdapter() {
		if (ticketItemProvider == null) {
			ticketItemProvider = new TicketItemProvider(this);
		}

		return ticketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Booking} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingItemProvider bookingItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookingAdapter() {
		if (bookingItemProvider == null) {
			bookingItemProvider = new BookingItemProvider(this);
		}

		return bookingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Payment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentItemProvider paymentItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaymentAdapter() {
		if (paymentItemProvider == null) {
			paymentItemProvider = new PaymentItemProvider(this);
		}

		return paymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Baggage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaggageItemProvider baggageItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Baggage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaggageAdapter() {
		if (baggageItemProvider == null) {
			baggageItemProvider = new BaggageItemProvider(this);
		}

		return baggageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Passenger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerItemProvider passengerItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPassengerAdapter() {
		if (passengerItemProvider == null) {
			passengerItemProvider = new PassengerItemProvider(this);
		}

		return passengerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.KIOSK} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KIOSKItemProvider kioskItemProvider;

	/**
	 * This creates an adapter for a {@link bts.KIOSK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKIOSKAdapter() {
		if (kioskItemProvider == null) {
			kioskItemProvider = new KIOSKItemProvider(this);
		}

		return kioskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Online_payment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Online_paymentItemProvider online_paymentItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Online_payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOnline_paymentAdapter() {
		if (online_paymentItemProvider == null) {
			online_paymentItemProvider = new Online_paymentItemProvider(this);
		}

		return online_paymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bts.Bus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusItemProvider busItemProvider;

	/**
	 * This creates an adapter for a {@link bts.Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusAdapter() {
		if (busItemProvider == null) {
			busItemProvider = new BusItemProvider(this);
		}

		return busItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (cityItemProvider != null)
			cityItemProvider.dispose();
		if (seatItemProvider != null)
			seatItemProvider.dispose();
		if (ticketItemProvider != null)
			ticketItemProvider.dispose();
		if (bookingItemProvider != null)
			bookingItemProvider.dispose();
		if (paymentItemProvider != null)
			paymentItemProvider.dispose();
		if (baggageItemProvider != null)
			baggageItemProvider.dispose();
		if (passengerItemProvider != null)
			passengerItemProvider.dispose();
		if (kioskItemProvider != null)
			kioskItemProvider.dispose();
		if (online_paymentItemProvider != null)
			online_paymentItemProvider.dispose();
		if (busItemProvider != null)
			busItemProvider.dispose();
	}

}