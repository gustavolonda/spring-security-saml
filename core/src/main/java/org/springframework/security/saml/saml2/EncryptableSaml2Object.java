/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml.saml2;

import org.springframework.security.saml.saml2.encrypt.DataEncryptionMethod;
import org.springframework.security.saml.saml2.encrypt.KeyEncryptionMethod;
import org.springframework.security.saml.saml2.key.KeyData;

public interface EncryptableSaml2Object<T extends Saml2Object> extends Saml2Object {

	T setEncryptionKey(KeyData encryptionKey,
					   KeyEncryptionMethod keyAlgorithm,
					   DataEncryptionMethod dataAlgorithm);


	KeyData getEncryptionKey();

	KeyEncryptionMethod getKeyAlgorithm();

	DataEncryptionMethod getDataAlgorithm();
}
