package com.sensirion.libble.listeners.devices;

import com.sensirion.libble.listeners.NotificationListener;

/**
 * This listener tells to the user when scan is turned on or off.
 */
public interface ScanListener extends NotificationListener {
    /**
     * NOTE: When scan is (re)enabled the library clears it's internal list for discovered devices.
     * This method tells to the user when scan is turned on or off.
     *
     * @param isScanEnabled <code>true</code> if scan is turned on - <code>false</code> otherwise.
     */
    void onScanStateChanged(boolean isScanEnabled);
}
