/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.strata.report.format;

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
 * Contains formatting settings for a specific type.
 */
@BeanDefinition
public class FormatSettings implements ImmutableBean {

  /** The category of this type. */
  @PropertyDefinition(validate = "notNull")
  private final FormatCategory category;
  
  /** The formatter to use to convert this type into a string. */
  @PropertyDefinition
  private final ValueFormatter<?> formatter;
  
  /**
   * Constructs an instance.
   * 
   * @param category  the category of the type
   * @param formatter  the formatter the use for the type
   * @return the format settings
   */
  public static FormatSettings of(FormatCategory category, ValueFormatter<?> formatter) {
    return FormatSettings.builder()
        .category(category)
        .formatter(formatter)
        .build();
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code FormatSettings}.
   * @return the meta-bean, not null
   */
  public static FormatSettings.Meta meta() {
    return FormatSettings.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(FormatSettings.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static FormatSettings.Builder builder() {
    return new FormatSettings.Builder();
  }

  /**
   * Restricted constructor.
   * @param builder  the builder to copy from, not null
   */
  protected FormatSettings(FormatSettings.Builder builder) {
    JodaBeanUtils.notNull(builder.category, "category");
    this.category = builder.category;
    this.formatter = builder.formatter;
  }

  @Override
  public FormatSettings.Meta metaBean() {
    return FormatSettings.Meta.INSTANCE;
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
   * Gets the category of this type.
   * @return the value of the property, not null
   */
  public FormatCategory getCategory() {
    return category;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the formatter to use to convert this type into a string.
   * @return the value of the property
   */
  public ValueFormatter<?> getFormatter() {
    return formatter;
  }

  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      FormatSettings other = (FormatSettings) obj;
      return JodaBeanUtils.equal(getCategory(), other.getCategory()) &&
          JodaBeanUtils.equal(getFormatter(), other.getFormatter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(getCategory());
    hash = hash * 31 + JodaBeanUtils.hashCode(getFormatter());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("FormatSettings{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("category").append('=').append(JodaBeanUtils.toString(getCategory())).append(',').append(' ');
    buf.append("formatter").append('=').append(JodaBeanUtils.toString(getFormatter())).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code FormatSettings}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code category} property.
     */
    private final MetaProperty<FormatCategory> category = DirectMetaProperty.ofImmutable(
        this, "category", FormatSettings.class, FormatCategory.class);
    /**
     * The meta-property for the {@code formatter} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<ValueFormatter<?>> formatter = DirectMetaProperty.ofImmutable(
        this, "formatter", FormatSettings.class, (Class) ValueFormatter.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "category",
        "formatter");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 50511102:  // category
          return category;
        case 1811591370:  // formatter
          return formatter;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public FormatSettings.Builder builder() {
      return new FormatSettings.Builder();
    }

    @Override
    public Class<? extends FormatSettings> beanType() {
      return FormatSettings.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code category} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<FormatCategory> category() {
      return category;
    }

    /**
     * The meta-property for the {@code formatter} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<ValueFormatter<?>> formatter() {
      return formatter;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 50511102:  // category
          return ((FormatSettings) bean).getCategory();
        case 1811591370:  // formatter
          return ((FormatSettings) bean).getFormatter();
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
   * The bean-builder for {@code FormatSettings}.
   */
  public static class Builder extends DirectFieldsBeanBuilder<FormatSettings> {

    private FormatCategory category;
    private ValueFormatter<?> formatter;

    /**
     * Restricted constructor.
     */
    protected Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    protected Builder(FormatSettings beanToCopy) {
      this.category = beanToCopy.getCategory();
      this.formatter = beanToCopy.getFormatter();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 50511102:  // category
          return category;
        case 1811591370:  // formatter
          return formatter;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 50511102:  // category
          this.category = (FormatCategory) newValue;
          break;
        case 1811591370:  // formatter
          this.formatter = (ValueFormatter<?>) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public FormatSettings build() {
      return new FormatSettings(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the {@code category} property in the builder.
     * @param category  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder category(FormatCategory category) {
      JodaBeanUtils.notNull(category, "category");
      this.category = category;
      return this;
    }

    /**
     * Sets the {@code formatter} property in the builder.
     * @param formatter  the new value
     * @return this, for chaining, not null
     */
    public Builder formatter(ValueFormatter<?> formatter) {
      this.formatter = formatter;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("FormatSettings.Builder{");
      int len = buf.length();
      toString(buf);
      if (buf.length() > len) {
        buf.setLength(buf.length() - 2);
      }
      buf.append('}');
      return buf.toString();
    }

    protected void toString(StringBuilder buf) {
      buf.append("category").append('=').append(JodaBeanUtils.toString(category)).append(',').append(' ');
      buf.append("formatter").append('=').append(JodaBeanUtils.toString(formatter)).append(',').append(' ');
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}