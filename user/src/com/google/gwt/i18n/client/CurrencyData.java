/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.i18n.client;

/**
 * Information about a currency.
 */
public interface CurrencyData {

  /**
   * @return the ISO4217 code for this currency
   */
  String getCurrencyCode();

  /**
   * @return the default symbol to use for this currency
   */
  String getCurrencySymbol();

  /**
   * @return the default number of decimal positions for this currency
   */
  int getDefaultFractionDigits();

  /**
   * @return the default symbol to use for this currency, intended to be
   * recognizable in most locales.  If such a symbol is not available, it is
   * acceptable to return the same value as {@link #getCurrencySymbol()}.
   */
  String getPortableCurrencySymbol();

  /**
   * @return true if this currency is deprecated and should not be returned by
   * default in currency lists.
   */
  boolean isDeprecated();

  /**
   * @return true if there should always be a space between the currency symbol
   * and the number, false if there should be no space.  Ignored unless
   * {@link #isSpacingFixed()} returns true.
   */
  boolean isSpaceForced();

  /**
   * @return true if the spacing between the currency symbol and the number is
   * fixed regardless of locale defaults.  In this case, spacing will be
   * determined by {@link #isSpaceForced()}.
   */
  boolean isSpacingFixed();

  /**
   * @return true if the position of the currency symbol relative to the number
   * is fixed regardless of locale defaults.  In this case, the position will be
   * determined by {@link #isSymbolPrefix()}.
   */
  boolean isSymbolPositionFixed();

  /**
   * @return true if the currency symbol should go before the number, false if
   * it should go after the number.  This is ignored unless
   * {@link #isSymbolPositionFixed()} is true.
   */
  boolean isSymbolPrefix();
}
