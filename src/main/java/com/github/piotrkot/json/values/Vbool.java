/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 piotrkot
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.piotrkot.json.values;

import com.github.piotrkot.json.JsonVal;
import javax.json.JsonValue;

/**
 * Boolean value.
 *
 * @since 1.0
 */
public final class Vbool implements JsonVal<Boolean> {
    /**
     * Value for boolean.
     */
    private final boolean val;

    /**
     * Ctor.
     * @param val Value for boolean.
     */
    public Vbool(final boolean val) {
        this.val = val;
    }

    @Override
    public JsonValue jsonValue() {
        final JsonValue bool;
        if (this.val) {
            bool = JsonValue.TRUE;
        } else {
            bool = JsonValue.FALSE;
        }
        return bool;
    }

    @Override
    public Boolean value() {
        return this.val;
    }
}
