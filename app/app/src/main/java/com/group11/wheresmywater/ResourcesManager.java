package com.group14.wheresmywater;

import org.andengine.audio.music.MusicManager;
import org.andengine.audio.sound.SoundManager;
import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.opengl.font.FontManager;
import org.andengine.opengl.texture.TextureManager;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.BaseGameActivity;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * The Class ResourcesManager.
 */
public class ResourcesManager {
	// ---------------------------------------------
	// VARIABLES
	// ---------------------------------------------

	/** The Constant INSTANCE. */
	private static final ResourcesManager INSTANCE = new ResourcesManager();

	/** The _engine. */
	public Engine _engine;

	/** The _activity. */
	public GameActivity _activity;

	/** The _camera. */
	public Camera _camera;

	/** The _vbom. */
	public VertexBufferObjectManager _vbom;

	// ---------------------------------------------
	// CLASS MANAGER RESOURCE SCENE
	// ---------------------------------------------
	/** The splash scene resource. */
	public SplashSceneResource _splashSceneResource;

	/** The main menu scene resource. */
	public MainMenuSceneResource _mainMenuSceneResource;

	/** The loading scene resource. */
	public LoadingSceneResource _loadingSceneResource;

	/** The score scene resource. */
	public ScoreSceneResource _scoreSceneResource;

	/** The level01 resource. */
	public Level01Resource _level01Resource;

	/** The level02 resource. */
	public Level02Resource _level02Resource;

	/** The level03 resource. */
	public Level03Resource _level03Resource;

	/** The level04 resource. */
	public Level04Resource _level04Resource;

	/** The level05 resource. */
	public Level05Resource _level05Resource;

	/** The level06 resource. */
	public Level06Resource _level06Resource;
	
	/** The level07 resource. */
	public Level07Resource _level07Resource;

	/** The level08 resource. */
	public Level08Resource _level08Resource;

	/** The level09 resource. */
	public Level09Resource _level09Resource;

	/** The level10 resource. */
	public Level10Resource _level10Resource;

	/** The level11 resource. */
	public Level11Resource _level11Resource;

	/** The level12 resource. */
	public Level12Resource _level12Resource;
	
	/** The level13 resource. */
	public Level13Resource _level13Resource;

	/** The level14 resource. */
	public Level14Resource _level14Resource;

	/** The level15 resource. */
	public Level15Resource _level15Resource;

	/** The level16 resource. */
	public Level16Resource _level16Resource;

	/** The level17 resource. */
	public Level17Resource _level17Resource;

	/** The level18 resource. */
	public Level18Resource _level18Resource;
	
	/** The level19 resource. */
	public Level19Resource _level19Resource;

	/** The level20 resource. -- Huy --*/
	public Level20Resource _level20Resource;

	/** The level21 resource. -- Huy --*/
	public Level21Resource _level21Resource;

	/** The level22 resource. -- Huy --*/
	public Level22Resource _level22Resource;

	/** The level23 resource. -- Huy --*/
	public Level23Resource _level23Resource;

	/** The level24 resource. -- Huy --*/
	public Level24Resource _level24Resource;
	
	/** The level25 resource. -- Huy --*/
	public Level25Resource _level25Resource;

	/** The level26 resource. -- Huy --*/
	public Level26Resource _level26Resource;

	/** The level27 resource. -- Huy --*/
	public Level27Resource _level27Resource;

	/** The level28 resource. -- Huy --*/
	public Level28Resource _level28Resource;

	/** The level29 resource. -- Huy --*/
	public Level29Resource _level29Resource;

	/** The level30 resource. -- Huy --*/
	public Level30Resource _level30Resource;

	/** The select level resource. */
	public SelectLevelSceneResource _selectLevelResource;

	public SelectLevelSceneResource1 _selectLevelResource1;

	public SelectLevelSceneResource2 _selectLevelResource2;

	public SelectLevelMainMenuResource _selectLevelMainMenuResource;

	// ---------------------------------------------
	// LOAD & UNLOAD RESOURCE
	// ---------------------------------------------
	/**
	 * Load splash screen.
	 */
	public final void loadSplashScreen() {
		_splashSceneResource = new SplashSceneResource();
		_splashSceneResource.load();
	}

	/**
	 * Unload splash screen.
	 */
	public final void unloadSplashScreen() {
		if (_splashSceneResource != null) {
			_splashSceneResource.unload();
			_splashSceneResource = null;
		}
	}

	/**
	 * Load main menu screen.
	 */
	public final void loadMainMenuScreen() {
		_mainMenuSceneResource = new MainMenuSceneResource();
		_mainMenuSceneResource.load();
	}

	/**
	 * Unload main menu screen.
	 */
	public final void unloadMainMenuScreen() {
		if (_mainMenuSceneResource != null) {
			_mainMenuSceneResource.unload();
			_mainMenuSceneResource = null;
		}
	}

	/**
	 * Load loading screen.
	 */
	public final void loadLoadingScreen() {
		_loadingSceneResource = new LoadingSceneResource();
		_loadingSceneResource.load();
	}

	/**
	 * Unload loading screen.
	 */
	public final void unloadLoadingScreen() {
		if (_loadingSceneResource != null) {
			_loadingSceneResource.unload();
			_loadingSceneResource = null;
		}
	}

	/**
	 * Load level01 screen.
	 */
	public final void loadLevel01Screen() {
		_level01Resource = new Level01Resource();
		_level01Resource.load();
	}

	/**
	 * Unload level01 screen.
	 */
	public final void unloadLevel01Screen() {
		if (_level01Resource != null) {
			_level01Resource.unload();
			_level01Resource = null;
		}
	}

	/**
	 * Load level02 screen.
	 */
	public final void loadLevel02Screen() {
		_level02Resource = new Level02Resource();
		_level02Resource.load();
	}

	/**
	 * Unload level02 screen.
	 */
	public final void unloadLevel02Screen() {
		if (_level02Resource != null) {
			_level02Resource.unload();
			_level02Resource = null;
		}
	}

	/**
	 * Load level03 screen.
	 */
	public final void loadLevel03Screen() {
		_level03Resource = new Level03Resource();
		_level03Resource.load();
	}

	/**
	 * Unload level03 screen.
	 */
	public final void unloadLevel03Screen() {
		if (_level03Resource != null) {
			_level03Resource.unload();
			_level03Resource = null;
		}
	}

	/**
	 * Load level04 screen.
	 */
	public final void loadLevel04Screen() {
		_level04Resource = new Level04Resource();
		_level04Resource.load();
	}

	/**
	 * Unload level04 screen.
	 */
	public final void unloadLevel04Screen() {
		if (_level04Resource != null) {
			_level04Resource.unload();
			_level04Resource = null;
		}
	}

	/**
	 * Load level05 screen.
	 */
	public final void loadLevel05Screen() {
		_level05Resource = new Level05Resource();
		_level05Resource.load();
	}

	/**
	 * Unload level05 screen.
	 */
	public final void unloadLevel05Screen() {
		if (_level05Resource != null) {
			_level05Resource.unload();
			_level05Resource = null;
		}
	}

	/**
	 * Load level06 screen.
	 */
	public final void loadLevel06Screen() {
		_level06Resource = new Level06Resource();
		_level06Resource.load();
	}

	/**
	 * Unload level06 screen.
	 */
	public final void unloadLevel06Screen() {
		if (_level06Resource != null) {
			_level06Resource.unload();
			_level06Resource = null;
		}
	}
	
	/**
	 * Load level07 screen.
	 */
	public final void loadLevel07Screen() {
		_level07Resource = new Level07Resource();
		_level07Resource.load();
	}

	/**
	 * Unload level07 screen.
	 */
	public final void unloadLevel07Screen() {
		if (_level07Resource != null) {
			_level07Resource.unload();
			_level07Resource = null;
		}
	}
	
	/**
	 * Load level08 screen.
	 */
	public final void loadLevel08Screen() {
		_level08Resource = new Level08Resource();
		_level08Resource.load();
	}

	/**
	 * Unload level08 screen.
	 */
	public final void unloadLevel08Screen() {
		if (_level08Resource != null) {
			_level08Resource.unload();
			_level08Resource = null;
		}
	}
	
	/**
	 * Load level09 screen.
	 */
	public final void loadLevel09Screen() {
		_level09Resource = new Level09Resource();
		_level09Resource.load();
	}

	/**
	 * Unload level09 screen.
	 */
	public final void unloadLevel09Screen() {
		if (_level09Resource != null) {
			_level09Resource.unload();
			_level09Resource = null;
		}
	}
	
	/**
	 * Load level10 screen.
	 */
	public final void loadLevel10Screen() {
		_level10Resource = new Level10Resource();
		_level10Resource.load();
	}

	/**
	 * Unload level10 screen.
	 */
	public final void unloadLevel10Screen() {
		if (_level10Resource != null) {
			_level10Resource.unload();
			_level10Resource = null;
		}
	}
	
	/**
	 * Load level11 screen.
	 */
	public final void loadLevel11Screen() {
		_level11Resource = new Level11Resource();
		_level11Resource.load();
	}

	/**
	 * Unload level11 screen.
	 */
	public final void unloadLevel11Screen() {
		if (_level11Resource != null) {
			_level11Resource.unload();
			_level11Resource = null;
		}
	}
	
	/**
	 * Load level12 screen.
	 */
	public final void loadLevel12Screen() {
		_level12Resource = new Level12Resource();
		_level12Resource.load();
	}

	/**
	 * Unload level12 screen.
	 */
	public final void unloadLevel12Screen() {
		if (_level12Resource != null) {
			_level12Resource.unload();
			_level12Resource = null;
		}
	}
	
	/**
	 * Load level13 screen.
	 */
	public final void loadLevel13Screen() {
		_level13Resource = new Level13Resource();
		_level13Resource.load();
	}

	/**
	 * Unload level13 screen.
	 */
	public final void unloadLevel13Screen() {
		if (_level13Resource != null) {
			_level13Resource.unload();
			_level13Resource = null;
		}
	}
	
	/**
	 * Load level14 screen.
	 */
	public final void loadLevel14Screen() {
		_level14Resource = new Level14Resource();
		_level14Resource.load();
	}

	/**
	 * Unload level14 screen.
	 */
	public final void unloadLevel14Screen() {
		if (_level14Resource != null) {
			_level14Resource.unload();
			_level14Resource = null;
		}
	}
	
	/**
	 * Load level15 screen.
	 */
	public final void loadLevel15Screen() {
		_level15Resource = new Level15Resource();
		_level15Resource.load();
	}

	/**
	 * Unload level15 screen.
	 */
	public final void unloadLevel15Screen() {
		if (_level15Resource != null) {
			_level15Resource.unload();
			_level15Resource = null;
		}
	}
	
	/**
	 * Load level16 screen.
	 */
	public final void loadLevel16Screen() {
		_level16Resource = new Level16Resource();
		_level16Resource.load();
	}

	/**
	 * Unload level16 screen.
	 */
	public final void unloadLevel16Screen() {
		if (_level16Resource != null) {
			_level16Resource.unload();
			_level16Resource = null;
		}
	}
	
	/**
	 * Load level17 screen.
	 */
	public final void loadLevel17Screen() {
		_level17Resource = new Level17Resource();
		_level17Resource.load();
	}

	/**
	 * Unload level17 screen.
	 */
	public final void unloadLevel17Screen() {
		if (_level17Resource != null) {
			_level17Resource.unload();
			_level17Resource = null;
		}
	}
	
	/**
	 * Load level18 screen.
	 */
	public final void loadLevel18Screen() {
		_level18Resource = new Level18Resource();
		_level18Resource.load();
	}

	/**
	 * Unload level18 screen.
	 */
	public final void unloadLevel18Screen() {
		if (_level18Resource != null) {
			_level18Resource.unload();
			_level18Resource = null;
		}
	}
	
	/**
	 * Load level19 screen.
	 */
	public final void loadLevel19Screen() {
		_level19Resource = new Level19Resource();
		_level19Resource.load();
	}

	/**
	 * Unload level19 screen.
	 */
	public final void unloadLevel19Screen() {
		if (_level19Resource != null) {
			_level19Resource.unload();
			_level19Resource = null;
		}
	}
	
	/**
	 * Load level20 screen.
	 */
	public final void loadLevel20Screen() {
		_level20Resource = new Level20Resource();
		_level20Resource.load();
	}

	/**
	 * Unload level20 screen.
	 */
	public final void unloadLevel20Screen() {
		if (_level20Resource != null) {
			_level20Resource.unload();
			_level20Resource = null;
		}
	}
	
	/**
	 * Load level21 screen.
	 */
	public final void loadLevel21Screen() {
		_level21Resource = new Level21Resource();
		_level21Resource.load();
	}

	/**
	 * Unload level21 screen.
	 */
	public final void unloadLevel21Screen() {
		if (_level21Resource != null) {
			_level21Resource.unload();
			_level21Resource = null;
		}
	}
	
	/**
	 * Load level22 screen.
	 */
	public final void loadLevel22Screen() {
		_level22Resource = new Level22Resource();
		_level22Resource.load();
	}

	/**
	 * Unload level22 screen.
	 */
	public final void unloadLevel22Screen() {
		if (_level22Resource != null) {
			_level22Resource.unload();
			_level22Resource = null;
		}
	}
	
	/**
	 * Load level23 screen.
	 */
	public final void loadLevel23Screen() {
		_level23Resource = new Level23Resource();
		_level23Resource.load();
	}

	/**
	 * Unload level23 screen.
	 */
	public final void unloadLevel23Screen() {
		if (_level23Resource != null) {
			_level23Resource.unload();
			_level23Resource = null;
		}
	}
	
	/**
	 * Load level24 screen.
	 */
	public final void loadLevel24Screen() {
		_level24Resource = new Level24Resource();
		_level24Resource.load();
	}

	/**
	 * Unload level24 screen.
	 */
	public final void unloadLevel24Screen() {
		if (_level24Resource != null) {
			_level24Resource.unload();
			_level24Resource = null;
		}
	}

	/**
	 * Load level25 screen.
	 */
	public final void loadLevel25Screen() {
		_level25Resource = new Level25Resource();
		_level25Resource.load();
	}

	/**
	 * Unload level25 screen.
	 */
	public final void unloadLevel25Screen() {
		if (_level25Resource != null) {
			_level25Resource.unload();
			_level25Resource = null;
		}
	}
	
	/**
	 * Load level26 screen.
	 */
	public final void loadLevel26Screen() {
		_level26Resource = new Level26Resource();
		_level26Resource.load();
	}

	/**
	 * Unload level26 screen.
	 */
	public final void unloadLevel26Screen() {
		if (_level26Resource != null) {
			_level26Resource.unload();
			_level26Resource = null;
		}
	}
	
	/**
	 * Load level27 screen.
	 */
	public final void loadLevel27Screen() {
		_level27Resource = new Level27Resource();
		_level27Resource.load();
	}

	/**
	 * Unload level27 screen.
	 */
	public final void unloadLevel27Screen() {
		if (_level27Resource != null) {
			_level27Resource.unload();
			_level27Resource = null;
		}
	}
	
	/**
	 * Load level28 screen.
	 */
	public final void loadLevel28Screen() {
		_level28Resource = new Level28Resource();
		_level28Resource.load();
	}

	/**
	 * Unload level28 screen.
	 */
	public final void unloadLevel28Screen() {
		if (_level28Resource != null) {
			_level28Resource.unload();
			_level28Resource = null;
		}
	}
	
	/**
	 * Load level29 screen.
	 */
	public final void loadLevel29Screen() {
		_level29Resource = new Level29Resource();
		_level29Resource.load();
	}

	/**
	 * Unload level29 screen.
	 */
	public final void unloadLevel29Screen() {
		if (_level29Resource != null) {
			_level29Resource.unload();
			_level29Resource = null;
		}
	}
	
	/**
	 * Load level30 screen.
	 */
	public final void loadLevel30Screen() {
		_level30Resource = new Level30Resource();
		_level30Resource.load();
	}

	/**
	 * Unload level30 screen.
	 */
	public final void unloadLevel30Screen() {
		if (_level30Resource != null) {
			_level30Resource.unload();
			_level30Resource = null;
		}
	}

	/**
	 * Load score screen.
	 */
	public final void loadScoreScreen() {
		_scoreSceneResource = new ScoreSceneResource();
		_scoreSceneResource.load();
	}

	/**
	 * Unload score screen.
	 */
	public final void unloadScoreScreen() {
		if (_scoreSceneResource != null) {
			_scoreSceneResource.unload();
			_scoreSceneResource = null;
		}
	}

	/**
	 * Load select level screen.
	 */
	public final void loadSelectLevelScreen() {
		_selectLevelResource = new SelectLevelSceneResource();
		_selectLevelResource.load();
	}

	public final void loadSelectLevelScreen1() {
		_selectLevelResource1 = new SelectLevelSceneResource1();
		_selectLevelResource1.load();
	}

	public final void loadSelectLevelScreen2() {
		_selectLevelResource2 = new SelectLevelSceneResource2();
		_selectLevelResource2.load();
	}

	public final void loadSelectLevelMainMenuScreen() {
		_selectLevelMainMenuResource = new SelectLevelMainMenuResource();
		_selectLevelMainMenuResource.load();
	}

	public final void unloadSelectLevelMainMenuScreen() {
		if (_selectLevelMainMenuResource != null) {
			_selectLevelMainMenuResource.unload();
			_selectLevelMainMenuResource = null;
		}
	}

	/**
	 * Unload select level screen.
	 */
	public final void unloadSelectLevelScreen() {
		if (_selectLevelResource != null) {
			_selectLevelResource.unload();
			_selectLevelResource = null;
		}
	}

	/**
	 * Prepare manager.
	 *
	 * @param engine the engine
	 * @param activity the activity
	 * @param camera the camera
	 * @param vbom <br>
	 * <br>
	 * We use this method at beginning of game loading, to prepare
	 * Resources Manager properly, setting all needed parameters, so
	 * we can latter access them from different classes (eg. scenes)
	 */
	public static void prepareManager(final Engine engine, GameActivity activity,
			Camera camera, VertexBufferObjectManager vbom) {
		getInstance()._engine = engine;
		getInstance()._activity = activity;
		getInstance()._camera = camera;
		getInstance()._vbom = vbom;
	}

	// ---------------------------------------------
	// GETTERS AND SETTERS
	// ---------------------------------------------
	/**
	 * Gets the single instance of ResourcesManager.
	 *
	 * @return single instance of ResourcesManager
	 */
	public static ResourcesManager getInstance() {
		return INSTANCE;
	}

	// ---------------------------------------------
	// GET MANAGERS
	// ---------------------------------------------
	/**
	 * Gets the font manager.
	 *
	 * @return the font manager
	 */
	public final FontManager getFontManager() {
		return _engine.getFontManager();
	}

	/**
	 * Gets the music manager.
	 *
	 * @return the music manager
	 */
	public final MusicManager getMusicManager() {
		return _engine.getMusicManager();
	}

	/**
	 * Gets the texture manager.
	 *
	 * @return the texture manager
	 */
	public final TextureManager getTextureManager() {
		return _engine.getTextureManager();
	}

	/**
	 * Gets the sound manager.
	 *
	 * @return the sound manager
	 */
	public final SoundManager getSoundManager() {
		return _engine.getSoundManager();
	}

	/**
	 * Gets the assets.
	 *
	 * @return the assets
	 */
	public final AssetManager getAssets() {
		return ((BaseGameActivity) _activity).getAssets();
	}

	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	public final Context getApplicationContext() {
		return _activity.getApplicationContext();
	}
}
