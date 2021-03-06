/*
 * Copyright 2016 Hemika Yasinda Kodikara
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jmeter.protocol.mqtt.utilities;

import org.apache.commons.lang3.StringUtils;
import org.apache.jorphan.io.TextFile;

/**
 * Utility class for plugin
 */
public class Utils {

    /**
     * Creates a UUID. The UUID is modified to avoid "ClientId longer than 23 characters" for MQTT.
     *
     * @return A UUID as a string.
     */
    public static String UUIDGenerator() {
        String clientId = System.currentTimeMillis() + "." + System.getProperty("user.name");
        clientId = StringUtils.substring(clientId, 0, 23);
        return clientId;
    }

    /**
     * The implementation uses TextFile to load the contents of the file and
     * returns a string.
     *
     * @param path path to the file to read in
     * @return the contents of the file
     */
    public static String getFileContent(String path) {
        TextFile tf = new TextFile(path);
        return tf.getText();
    }
}
