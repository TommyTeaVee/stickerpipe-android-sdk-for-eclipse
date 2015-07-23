/*
 *    Copyright (C) 2015
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package vc908.stickerfactory.ui.advancedrecyclerview.expandable;

/**
 * Interface which provides required information for expanding item.
 *
 * Implement this interface on your sub-class of the {@link android.support.v7.widget.RecyclerView.ViewHolder}.
 */
public interface ExpandableItemViewHolder {
    /**
     * Sets the state flags value for expanding item
     *
     * @param flags Bitwise OR of these flags;
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_GROUP}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_CHILD}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_EXPANDED}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_UPDATED}
     */
    void setExpandStateFlags(int flags);

    /**
     * Gets the state flags value for expanding item
     *
     * @return  Bitwise OR of these flags;
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_GROUP}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_CHILD}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_EXPANDED}
     *              - {@link RecyclerViewExpandableItemManager#STATE_FLAG_IS_UPDATED}
     */
    int getExpandStateFlags();
}
