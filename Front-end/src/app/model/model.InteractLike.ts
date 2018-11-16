import { User } from "./model.user";
import { Shop } from "./model.shop";

export class InteractLike {
    id : string;
    user: User;
    shop: Shop;
    type: string="LIKE"
  }
  