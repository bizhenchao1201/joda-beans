/*
 *  Copyright 2001-2015 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.impl.light;

import org.joda.beans.Bean;

/**
 * Functional interface providing the ability to get a property from a bean.
 * 
 * @author Stephen Colebourne
 */
public interface PropertyGetter {

    /**
     * Queries the property.
     * 
     * @param bean  the bean to query
     * @return the property value
     */
    Object get(Bean bean);

}
