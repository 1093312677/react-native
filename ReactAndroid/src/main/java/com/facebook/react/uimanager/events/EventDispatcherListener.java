// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.react.uimanager.events;

/**
 * Interface used to intercept events dispatched by {#link EventDispatcher}
 */
public interface EventDispatcherListener {
  /**
   * Called on every time an event is dispatched using {#link EventDispatcher#dispatchEvent}. Will be
   * called from the same thread that the event is being dispatched from.
   * @param event Event that was dispatched
   * @return If the event was handled. If true the event won't be sent to JS.
   */
  boolean onEventDispatch(Event event);
}
