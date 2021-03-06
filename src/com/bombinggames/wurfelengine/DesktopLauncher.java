/*
 * Copyright 2015 Benedikt Vogler.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * If this software is used for a game the official „Wurfel Engine“ logo or its name must be
 *   visible in an intro screen or main menu.
 * * Redistributions of source code must retain the above copyright notice, 
 *   this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice, 
 *   this list of conditions and the following disclaimer in the documentation 
 *   and/or other materials provided with the distribution.
 * * Neither the name of Benedikt Vogler nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software without specific
 *   prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.bombinggames.wurfelengine;

import com.bombinggames.wurfelengine.core.Controller;
import com.bombinggames.wurfelengine.extension.basicmainmenu.BasicMainMenu;
import com.bombinggames.wurfelengine.extension.basicmainmenu.BasicMenuItem;
import com.bombinggames.wurfelengine.extension.basicmainmenu.GameViewWithCamera;
import com.bombinggames.wurfelengine.mapeditor.EditorView;

/**
 * A test class for starting the engine.
 *
 * @author Benedikt Vogler
 */
public class DesktopLauncher {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		BasicMenuItem[] menuItems = new BasicMenuItem[]{
			new BasicMenuItem(0, "Load Map", Controller.class, GameViewWithCamera.class),
			new BasicMenuItem(1, "Map Editor", Controller.class, EditorView.class),
			new BasicMenuItem(2, "Exit")
		};

		WE.setMainMenu(new BasicMainMenu(menuItems));
		WE.launch("Wurfelengine V" + WE.VERSION, args);
	}

}
