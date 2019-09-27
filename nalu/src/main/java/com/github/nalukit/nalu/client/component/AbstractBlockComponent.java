/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.nalu.client.component;

public abstract class AbstractBlockComponent<C extends IsBlockComponent.Controller, W>
    implements IsBlockComponent<C, W> {

  private C controller;

  private W element;

  public AbstractBlockComponent() {
  }

  /**
   * create the block here
   */
  @Override
  public abstract void render();

  @Override
  public W asElement() {
    assert element != null : "no element set!";
    return this.element;
  }

  protected void initElement(W element) {
    this.element = element;
  }

  /**
   * call to show the block
   */
  @Override
  public abstract void show();

  /**
   * call to hide the hide
   */
  @Override
  public abstract void hide();

  @Override
  public void bind() {
    // if you need to bind some handlers and would like to do this in a separate method
    // just override this method.
  }

  @Override
  public C getController() {
    return this.controller;
  }

  @Override
  public void setController(C controller) {
    this.controller = controller;
  }

}
