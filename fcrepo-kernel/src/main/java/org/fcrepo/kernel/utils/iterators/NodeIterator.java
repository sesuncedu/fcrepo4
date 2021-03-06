/**
 * Copyright 2014 DuraSpace, Inc.
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
package org.fcrepo.kernel.utils.iterators;

import java.util.Iterator;

import javax.jcr.Node;

import com.google.common.collect.ForwardingIterator;

/**
 * Type-aware iterator to wrap the JCR NodeIterator
 *
 * @author ajs6f
 * @since Apr 20, 2013
 */
public class NodeIterator extends ForwardingIterator<Node> implements
        Iterable<Node> {

    private javax.jcr.NodeIterator i;

    /**
     * Wrap the NodeIterator with our generic version
     *
     * @param i
     */
    public NodeIterator(final javax.jcr.NodeIterator i) {
        this.i = i;
    }

    @Override
    public Iterator<Node> iterator() {
        return this;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Iterator<Node> delegate() {
        return i;
    }

}
