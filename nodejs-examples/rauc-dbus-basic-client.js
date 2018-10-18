const dbus = require('../index');

/*
	This test file's purpose is to show how to query a simple, basic DBus service with this library.
	In order to do that, we connect to the session bus, request the basic service (launch with 'node basic-service.js')
	and issue method calls.

  For rauc d-bus reference look at: https://rauc.readthedocs.io/en/latest/using.html#using-the-d-bus-api
*/

const serviceName = 'de.pengutronix.rauc'; // the service we request

// The interface we request of the service
const interfaceName = 'de.pengutronix.rauc.Installer';

// The object we request
const objectPath = `/`;

// First, connect to the session bus (works the same on the system bus, it's just less permissive)
const systemBus = dbus.systemBus();

// Check the connection was successful
if (!systemBus) {
  throw new Error('Could not connect to the DBus session bus.');
}

const service = systemBus.getService(serviceName);

service.getInterface(objectPath, interfaceName, (err, iface) => {
  if (err) {
    console.error(
      `Failed to request interface '${interfaceName}' at '${objectPath}' : ${
        err
      }`
        ? err
        : '(no error)'
    );
    process.exit(1);
  }

  // Read progress from rauc
  iface.Progress((err, str) => {
    if (err) {
      console.error(`Error while calling GiveTime: ${err}`);
    } else {
      console.log(`Progress returned: ${str}`);
    }

  });

  // Left from dbus-native example...
  iface.on('Rand', nb => {
    console.log(`Received Rand: ${nb}`);
  });
});
