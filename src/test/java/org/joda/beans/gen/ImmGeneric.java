/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(builderScope = "public")
public final class ImmGeneric<T extends Address> implements ImmutableBean {

    /** The name. */
    @PropertyDefinition(validate = "notNull")
    private final T value;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmGeneric}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static ImmGeneric.Meta meta() {
        return ImmGeneric.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code ImmGeneric}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> ImmGeneric.Meta<R> metaImmGeneric(Class<R> cls) {
        return ImmGeneric.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmGeneric.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T extends Address> ImmGeneric.Builder<T> builder() {
        return new ImmGeneric.Builder<T>();
    }

    private ImmGeneric(
            T value) {
        JodaBeanUtils.notNull(value, "value");
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ImmGeneric.Meta<T> metaBean() {
        return ImmGeneric.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public T getValue() {
        return value;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<T>(this);
    }

    @Override
    public ImmGeneric<T> clone() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmGeneric<?> other = (ImmGeneric<?>) obj;
            return JodaBeanUtils.equal(getValue(), other.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getValue());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("ImmGeneric{");
        buf.append("value").append('=').append(JodaBeanUtils.toString(getValue()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmGeneric}.
     */
    public static final class Meta<T extends Address> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code value} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T> value = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "value", ImmGeneric.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "value");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    return value;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmGeneric.Builder<T> builder() {
            return new ImmGeneric.Builder<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends ImmGeneric<T>> beanType() {
            return (Class) ImmGeneric.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code value} property.
         * @return the meta-property, not null
         */
        public MetaProperty<T> value() {
            return value;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    return ((ImmGeneric<?>) bean).getValue();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmGeneric}.
     */
    public static final class Builder<T extends Address> extends DirectFieldsBeanBuilder<ImmGeneric<T>> {

        private T value;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmGeneric<T> beanToCopy) {
            this.value = beanToCopy.getValue();
        }

        //-----------------------------------------------------------------------
        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    this.value = (T) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<T> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder<T> setString(MetaProperty<?> property, String value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<T> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmGeneric<T> build() {
            return new ImmGeneric<T>(
                    value);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the {@code value} property in the builder.
         * @param value  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> value(T value) {
            JodaBeanUtils.notNull(value, "value");
            this.value = value;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("ImmGeneric.Builder{");
            buf.append("value").append('=').append(JodaBeanUtils.toString(value));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
