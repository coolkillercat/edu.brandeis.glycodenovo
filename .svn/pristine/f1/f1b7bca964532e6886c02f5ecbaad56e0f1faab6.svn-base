/**
 * @author Pengyu Hong @ Brandeis University. Developed 07/03/2006, tested on 07/21/2006.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS WITHOUT WARRANTIES OR CONDITIONS OF 
 * ANY KIND, either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License.
 */

package edu.brandeis.glycodenovo.core;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class HLightArrayList<T extends Comparable<? super T>> extends ArrayList<T>
{
	public boolean	Ascend = true;
	public boolean	AllowDuplication = false;
	public boolean	Sorted = true;

	public HLightArrayList ( )
	{
	}

	public HLightArrayList ( boolean sorted, boolean allowDuplication )
	{
		this.Sorted = sorted;
		this.AllowDuplication = allowDuplication;
	}

	public boolean add ( T data )
	{
		if ( ( Sorted ) && ( this.size() > 0 ) )
		{
			float r = this.rank( data );
			int closestInd = (int) (r + 0.5f);
			
			if ( closestInd == r )
			{
				if ( this.AllowDuplication ) {
					super.add( closestInd, data );
					return true;
				}
				else
					return false;
			}
			else {
				super.add( closestInd, data );	
				return true;
			}
		}
		
		return super.add( data );
	}
	
	public T addOne ( T data ) // Return the existing one if duplicates
	{
		if ( ( Sorted ) && ( this.size() > 0 ) )
		{
			float r = this.rank( data );
			int closestInd = (int) (r + 0.5f);
			
			if ( closestInd == r )
			{
				if ( this.AllowDuplication )
				{
					super.add( closestInd, data );
					return data;
				}
				else
					return this.get(closestInd);
			}
			else
			{
				super.add( closestInd, data );
				return data;
			}
		}
		
		super.add( data );
		return data;
	}
	
	public boolean addAll ( HLightArrayList<T> data )
	{
		if ( data == null )
			return false;
		
		for ( T item : data )
			this.add( item );
		
		return true;
	}
	
	public float rank ( T obj )
	/// <summary>
	/// Return the number of elements that are smaller than obj (or bigger is Ascend = false).
	/// </summary>
	/// <param name="obj"></param>
	/// <returns></returns>
	{
		if ( obj == null )
			return -1;
		
		int	c = 0, left, right, mid;
		left = 0; right = this.size()-1; mid = right / 2;
		T middle_obj;
		float offset;
		
		if ( right < left ) 
			return -1;
		
		if ( this.Ascend )
			offset = 0.5f;
		else
			offset = -0.5f;
		
		while ( right >= left )
		{
			middle_obj = this.get( mid );
			
			c = middle_obj.compareTo( obj );

			if ( c == 0 )
				return mid;
			else if ( c < 0 )
			{
				if ( left == right )
					return mid + offset;
				else
				{
					if ( this.Ascend )
						left = mid+1;
					else
						right = mid;
					mid = (left + right) / 2;
				}
			}
			else
			{
				if ( left == right )
					return mid - offset;
				else
				{
					if ( this.Ascend )
						right = mid;
					else
						left = mid+1;
					mid = (left + right)/2;
				}
			}
		}
		return -1;
	}
	
	public int binarySearch ( T obj )
	{
		float r = this.rank( obj );
		int closest = (int) (r + 0.5f);
		if ( closest == r )
			return closest;
		return -1;
	}

	public boolean remove ( T obj )
	{
		if ( obj == null ) return true;
		if ( Sorted )
		{
			int	index = binarySearch( obj );
			if ( index >= 0 )
			{
				super.remove( index );
				return true;
			}
			return false;
		}
		else
			return super.remove(obj);
	}

	public int indexOf ( T obj )
	{
		if ( Sorted )
			return binarySearch( obj );
		return super.indexOf(obj);
	}
	
	public void sort ( )
	{
		sort ( 0, this.size()-1 );
	}
	
	private void sort ( int p, int r )
	{
		if ( p < r )
		{
			int q = partition( p, r );
			sort ( p, q );
			sort ( q+1, r );
		}
	}
	
	private int partition( int p, int r )
	{
		T x = this.get( p );
		T temp;
		int c = 0;
		
		int i = p - 1;
		int j = r + 1;
		
		while ( true )
		{
			do  
			{ 
				j--;
				temp = this.get( j );
				// c = temp.compareTo( x );
				c = this.compare( (String)temp, (String)x );
				if ( !this.Ascend )
					c = -c;
			} 
			while ( c > 0 );
			
			do  
			{ 
				i++;
				temp = this.get( i );
				// c = temp.compareTo( x );
				c = this.compare( (String)temp, (String)x );
				if ( !this.Ascend )
					c = -c;
			} 
			while ( c < 0 );
			
			if ( i < j )
			{
				temp = this.get( i );
				this.set( i, this.get( j ) );
				this.set( j, temp );
			}
			else
				return j;
		}
	}
	
	private int compare(String obj1, String obj2)
	{
		int result, len1, len2;
		
		len1 = obj1.length();
		len2 = obj2.length();
		if (len1 < len2)
			result = -1;
		else if (len1 > len2)
			result = 1;
		else
			result = obj1.compareTo(obj2);
		return result;
	}
}
