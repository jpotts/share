/*
 * Copyright (C) 2005-2015 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.web.evaluator;

import org.json.simple.JSONObject;

/**
 * Evaluator for virtual folders.
 * 
 * @author sdinuta
 *
 */
public class VirtualFolderEvaluator extends VirtualBaseEvaluator
{
    /**
     * Evaluates if we have a virtual folder.
     * 
     * @param jsonObject The object the evaluation is for
     * 
     * @return <code>true</code> if the folder is virtual, or <code>false</code> otherwise.
     */
    @Override
    public boolean evaluate(JSONObject jsonObject)
    {
        if(hasAspect(jsonObject, "vm:virtual")){
            return true;
        }
        return false;
    }
}