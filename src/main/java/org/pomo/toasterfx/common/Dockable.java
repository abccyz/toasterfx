/*
 * Copyright © 2020 Mr.Po (ldd_live@foxmail.com)
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
package org.pomo.toasterfx.common;

import javafx.scene.Node;
import lombok.NonNull;
import org.pomo.toasterfx.model.Toast;

/**
 * <h2>可停靠的组件</h2>
 *
 * <p>实现此接口的Toast、Node，当Node展示/退出时，会触发此执行。</p>
 * <br/>
 *
 * <p>创建时间：2020-09-23 14:43:28</p>
 * <p>更新时间：2020-09-23 14:43:28</p>
 *
 * @author Mr.Po
 * @version 1.0
 */
public interface Dockable {

    /**
     * <h2>显示回调</h2>
     *
     * <p>播放进入动画前</p>
     *
     * @param toast 消息体
     * @param node  Node
     */
    void dock(@NonNull Toast toast, @NonNull Node node);

    /**
     * <h2>隐藏回调</h2>
     *
     * <p>退出动画结束后</p>
     *
     * @param toast 消息体
     * @param node  Node
     */
    void unDock(@NonNull Toast toast, @NonNull Node node);
}
