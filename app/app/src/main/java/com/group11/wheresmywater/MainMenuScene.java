package com.group14.wheresmywater;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.andengine.entity.scene.background.SpriteBackground;
import org.andengine.entity.scene.menu.MenuScene;
import org.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener;
import org.andengine.entity.scene.menu.item.IMenuItem;
import org.andengine.entity.scene.menu.item.SpriteMenuItem;
import org.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;

import android.os.Environment;

import com.group14.wheresmywater.SceneManager.SceneType;

/**
 * The Class MainMenuScene
 */
public class MainMenuScene extends BaseScene implements
		IOnMenuItemClickListener {
	
	/** The resource. */
	private MainMenuSceneResource _resource;
	
	/** The background. */
	private Sprite background;
	
	/** The radio. */
	private Sprite radio;
	
	/** The child scene. */
	private MenuScene childScene;

	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#createScene()
	 */
	@Override
	public void createScene() {
		_resource = ResourcesManager.getInstance()._mainMenuSceneResource;

		createBackground();
		createMenu();
		createMusic();
	}

	/**
	 * Creates the background.
	 */
	private void createBackground() {
		background = new Sprite(0, 0, Global.CAMERA_WIDTH,
				Global.CAMERA_HEIGHT, _resource.bg_region, _vbom);
		setBackground(new SpriteBackground(background));
	}



	/** The menu play. */
	private final int MENU_PLAY = 0;

	/**
	 * Creates the menu.
	 */
	private void createMenu() {
		childScene = new MenuScene(this._camera);
		childScene.setPosition(0, 0);

		final IMenuItem playMenuItem = new ScaleMenuItemDecorator(
				new SpriteMenuItem(MENU_PLAY, 274, 82,
						_resource.btnPlay_region, _vbom), 1.1f, 1);

		childScene.addMenuItem(playMenuItem);
		childScene.buildAnimations();
		childScene.setBackgroundEnabled(false);
		childScene.setOnMenuItemClickListener(this);

		//Tuan
		//edit position Btn Play
		playMenuItem.setPosition(265, 900);

		setChildScene(childScene);
	}

	/**
	 * Creates the music.
	 */
	private void createMusic() {
		_resource.music.setLooping(true);
		_resource.music.play();
	}

	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#onBackKeyPressed()
	 */
	@Override
	public void onBackKeyPressed() {
		System.exit(0);
	}

	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#disposeScene()
	 */
	@Override
	public void disposeScene() {

		ResourcesManager.getInstance().unloadMainMenuScreen();

		System.out.println("Mainmenu Dispose");
	}

	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#getSceneType()
	 */
	@Override
	public SceneType getSceneType() {
		return SceneType.SCENE_MENU;
	}

	/* (non-Javadoc)
	 * @see org.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener#onMenuItemClicked(org.andengine.entity.scene.menu.MenuScene, org.andengine.entity.scene.menu.item.IMenuItem, float, float)
	 */
	@Override
	public boolean onMenuItemClicked(MenuScene pMenuScene, IMenuItem pMenuItem,
			float pMenuItemLocalX, float pMenuItemLocalY) {
		// TODO Auto-generated method stub
		if (_resource.music.isPlaying())
			_resource.music.stop();

		int id = pMenuItem.getID();
		switch (id) {
		case MENU_PLAY:
			//createFileData("wmw.txt");
			//createFileData("wmw1.txt");
			//createFileData("wmw2.txt");
			if (isPlayFirst("wmw.txt")) {
				//SceneManager.getInstance().loadLevel01Scene(_engine);
				createFileData("wmw.txt");
			}
			if(isPlayFirst("wmw1.txt")){
				createFileData("wmw1.txt");
			}
			if(isPlayFirst("wmw2.txt")){
				createFileData("wmw2.txt");
			}
			//SceneManager.getInstance().loadSelectLevelScene(_engine);
			SceneManager.getInstance().loadSelectLevelMainMenu(_engine);
			break;
		default:
			break;
		}

		return true;
	}

	/**
	 * Creates the file data.
	 */
	private void createFileData(String txtname) {
		// TODO Auto-generated method stub
		String[] s = new String[Global.nScene];
		int index = 1;
		if(txtname == "wmw1"){
			index=10;
		}
		if(txtname == "wmw2"){
			index=20;
		}
		for (int i = 0; i < s.length; i++) {
			s[i] = String.valueOf(i + index) + "," + "0" + "," + "0";
		}

		try {
			File root = Environment.getExternalStorageDirectory();
			FileWriter filewriter = new FileWriter(new File(root, txtname));
			BufferedWriter writer = new BufferedWriter(filewriter);
			for (int i = 0; i < s.length; i++) {
				writer.write(s[i] + '\n');
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Checks if is play first.
	 *
	 * @return true, if is play first
	 */
	private boolean isPlayFirst(String nametxt ) {
		String str = "";
		try {
			File root = Environment.getExternalStorageDirectory();
			FileReader filereader = new FileReader(new File(root, nametxt));
			BufferedReader reader = new BufferedReader(filereader);
			str = reader.readLine();
			filereader.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//if(str == null){return true;}

		if (str != "" && Integer.parseInt(str.split(",")[2]) == 0)
			return true;

		return false;
	}



	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#clone()
	 */
	@Override
	public BaseScene clone() {
		// TODO Auto-generated method stub
		return new MainMenuScene();
	}

	/* (non-Javadoc)
	 * @see com.group14.wheresmywater.BaseScene#load()
	 */
	@Override
	public void load() {
		// TODO Auto-generated method stub
		ResourcesManager.getInstance().loadMainMenuScreen();
	}

}
