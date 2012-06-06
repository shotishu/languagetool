/* LanguageTool, a natural language style checker 
 * Copyright (C) 2012 Marcin Miłkowski (http://www.languagetool.org)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */

package org.languagetool.language;

import org.languagetool.rules.Rule;
import org.languagetool.rules.en.BritishReplaceRule;
import org.languagetool.rules.spelling.hunspell.HunspellRule;

import java.util.ArrayList;
import java.util.List;

public class BritishEnglish extends English {

  @Override
  public final String[] getCountryVariants() {
    return new String[]{"GB"};
  }

  @Override
  public String getName() {
    return "British English";
  }

  public List<Class<? extends Rule>> getRelevantRules() {
    final List<Class<? extends Rule>> rules = new ArrayList<Class<? extends Rule>>();
    rules.addAll(super.getRelevantRules());
    rules.add(HunspellRule.class);
    // specific to British English:
    rules.add(BritishReplaceRule.class);
    return rules;
  }
}