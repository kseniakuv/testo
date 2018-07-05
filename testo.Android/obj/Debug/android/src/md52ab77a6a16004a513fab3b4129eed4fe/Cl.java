package md52ab77a6a16004a513fab3b4129eed4fe;


public class Cl
	extends md51558244f76c53b6aeda52c8a337f2c37.FormsAppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("testo.Droid.Cl, testo.Android", Cl.class, __md_methods);
	}


	public Cl ()
	{
		super ();
		if (getClass () == Cl.class)
			mono.android.TypeManager.Activate ("testo.Droid.Cl, testo.Android", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
