package vo;

import enums.Vehicles;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class VehicleVO extends Base {
	private Vehicles type;
}
